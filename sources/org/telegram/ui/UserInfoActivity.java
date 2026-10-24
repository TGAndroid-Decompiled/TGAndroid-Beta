package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class UserInfoActivity extends org.telegram.ui.Components.d71 implements NotificationCenter.NotificationCenterDelegate {
    public String F;
    public String G;
    public String H;
    public TL_account.TL_birthday I;
    public long J;
    public TL_account.TL_birthday K;
    public TLRPC.Chat L;
    public boolean M;
    public boolean N;
    public boolean P;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public fg1 d;
    public fg1 e;
    public fg1 f34252f;
    public int firstNameRow;
    public int lastNameRow;
    public int logoutRow;
    public CharSequence f34253n;
    public int numberRow;
    public CharSequence f34254r;
    public int usernameRow;
    public org.telegram.ui.Components.yr v;
    public org.telegram.ui.Components.cq f34256w;
    public org.telegram.ui.ActionBar.u0 f34257x;
    public org.telegram.ui.Components.c71 f34258y;
    public int h = Integer.MIN_VALUE;
    public ArrayList f34255s = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final gg1 O = new gg1(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static void Y(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.v.a(0.0f);
            boolean z10 = tLObject instanceof TL_account.updateBirthday;
            if (z10 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    userInfoActivity.showDialog(alertDialog$Builder.f20679a);
                }
            } else {
                org.telegram.ui.Components.vc.d0(tL_error);
            }
            if (z10) {
                if (tL_birthday != null) {
                    userFull.flags |= 32;
                } else {
                    userFull.flags &= -33;
                }
                userFull.birthday = tL_birthday;
                userInfoActivity.getMessagesStorage().updateUserInfo(userFull, false);
            }
        } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
            userInfoActivity.v.a(0.0f);
            org.telegram.messenger.tl.q(R.string.UnknownError, org.telegram.ui.Components.vc.a0(userInfoActivity), null);
        } else {
            userInfoActivity.Q = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
            }
        }
    }

    public static String Z(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, tL_birthday.year);
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return LocaleController.getInstance().getFormatterBoostExpired().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return LocaleController.getInstance().getFormatterDayMonth().format(calendar2.getTimeInMillis());
    }

    public static boolean a0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        boolean z10;
        boolean z11;
        if (tL_birthday == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (tL_birthday2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11 || (tL_birthday != null && (tL_birthday.day != tL_birthday2.day || tL_birthday.month != tL_birthday2.month || tL_birthday.year != tL_birthday2.year))) {
            return false;
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, org.telegram.ui.Components.a71 a71Var) {
        boolean z10;
        int max;
        String str;
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.E;
        arrayList2.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new o70(9));
        arrayList.add(org.telegram.ui.Components.l61.t(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l61.k(this.d));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l61.k(this.e));
        arrayList.add(org.telegram.ui.Components.l61.A(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l61.k(this.f34252f));
        arrayList.add(org.telegram.ui.Components.l61.B(this.f34253n));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        i2.o1.q(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(x71.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.tl.h(new StringBuilder("+"), currentUser.phone, jf.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(x71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(x71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(x71.a(9, -14899731, -15431455, R.drawable.filled_birthday, Z(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(x71.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.f34254r == null) {
            String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
            if (!privacyRules.isEmpty()) {
                int i11 = 0;
                while (true) {
                    if (i11 >= privacyRules.size()) {
                        break;
                    } else if (privacyRules.get(i11) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        break;
                    } else {
                        if ((privacyRules.get(i11) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i11) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                        }
                        i11++;
                    }
                }
            }
            this.f34254r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new dg1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.l61.B(this.f34254r));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(x71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(x71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(x71.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.N) {
            arrayList.add(x71.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.f34255s;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.f34255s;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList4.get(i12);
                i12++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(UserObject.getUserName(user));
                }
            }
            arrayList.add(x71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        } else {
            arrayList.add(x71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.r8.b(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.l61.A(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        if (UserConfig.getActivatedAccountsCount() < 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i13 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i14 = jg1.f38559a;
            org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(jg1.class);
            J.d = 10;
            J.f28226k = i13;
            J.f28227l = string2;
            J.f28228m = null;
            J.f28240z = 0;
            J.f28232q = true;
            arrayList.add(J);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                i2.o1.q(R.string.SettingsAccounts, arrayList);
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                int intValue = ((Integer) arrayList2.get(i15)).intValue();
                int i16 = v71.f42600a;
                org.telegram.ui.Components.l61 J2 = org.telegram.ui.Components.l61.J(v71.class);
                J2.d = i15;
                J2.f28240z = intValue;
                arrayList.add(J2);
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                if (Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount()) > 0) {
                    str = LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                arrayList.add(org.telegram.ui.Components.l61.B(TextUtils.concat(str, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new dg1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.l61.B(null));
            }
        }
        this.logoutRow = arrayList.size();
        int i17 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i18 = jg1.f38559a;
        org.telegram.ui.Components.l61 J3 = org.telegram.ui.Components.l61.J(jg1.class);
        J3.d = 11;
        J3.f28226k = i17;
        J3.f28227l = string3;
        J3.f28228m = null;
        J3.f28240z = 0;
        J3.f28233r = true;
        arrayList.add(J3);
        arrayList.add(org.telegram.ui.Components.l61.A(-4, null));
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override
    public final void W(org.telegram.ui.Components.l61 l61Var, View view) {
        boolean z10;
        long j10;
        int i10 = 0;
        Integer num = null;
        if (l61Var.d == 10) {
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!UserConfig.getInstance(i11).isClientActivated()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                presentFragment(new hg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                showDialog(new sg.j0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (l61Var.G(v71.class)) {
            int i12 = l61Var.f28240z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.P0(i12);
            }
        } else {
            int i13 = l61Var.d;
            if (i13 != 1 && i13 != 9) {
                if (i13 == 2) {
                    this.K = null;
                    org.telegram.ui.Components.c71 c71Var = this.f34258y;
                    if (c71Var != null) {
                        c71Var.Z2.N(true);
                    }
                    b0(true);
                    return;
                } else if (i13 == 3) {
                    TLRPC.Chat chat = this.L;
                    if (chat == null) {
                        j10 = 0;
                    } else {
                        j10 = chat.f20344id;
                    }
                    eg1 eg1Var = new eg1(this, 1);
                    ?? d71Var = new org.telegram.ui.Components.d71();
                    d71Var.f38290r = false;
                    gg1 gg1Var = this.O;
                    d71Var.d = gg1Var;
                    d71Var.e = j10;
                    d71Var.f38288f = eg1Var;
                    hg1 hg1Var = new hg1(d71Var, 1);
                    if (gg1Var.f37574c) {
                        hg1Var.run();
                    } else {
                        gg1Var.f37575f.add(hg1Var);
                    }
                    presentFragment((org.telegram.ui.ActionBar.o2) d71Var);
                    return;
                } else if (i13 == 5) {
                    presentFragment(new ig.c1());
                    return;
                } else if (i13 == 4) {
                    presentFragment(new ig.e1());
                    return;
                } else if (i13 == 6) {
                    presentFragment(new ig.s0());
                    return;
                } else if (i13 == 7) {
                    presentFragment(new g(3));
                    return;
                } else if (i13 == 8) {
                    presentFragment(new sa(null));
                    return;
                } else if (i13 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.o2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.K;
            eg1 eg1Var2 = new eg1(this, 0);
            if (tL_birthday != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            showDialog(org.telegram.ui.Components.d5.l(parentActivity, string, string2, tL_birthday, eg1Var2, null, false, z10, getResourceProvider()).f20729a);
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.l61 l61Var, View view) {
        return false;
    }

    public final void b0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UserInfoActivity.b0(boolean):void");
    }

    public final void c0(boolean z10) {
        long j10;
        int i10;
        if (this.v.f33027c <= 0.0f) {
            if (z10 && TextUtils.isEmpty(this.d.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                fg1 fg1Var = this.d;
                int i11 = -this.R;
                this.R = i11;
                AndroidUtilities.shakeViewSpring(fg1Var, i11);
                return;
            }
            this.v.a(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.d.getText()) && (!TextUtils.equals(this.F, this.d.getText().toString()) || !TextUtils.equals(this.G, this.e.getText().toString()) || !TextUtils.equals(this.H, this.f34252f.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.d.getText().toString();
                    currentUser.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.e.getText().toString();
                    currentUser.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.f34252f.getText().toString();
                    userFull.about = charSequence3;
                    updateprofile.about = charSequence3;
                    if (TextUtils.isEmpty(charSequence3)) {
                        i10 = userFull.flags & (-3);
                    } else {
                        i10 = userFull.flags | 2;
                    }
                    userFull.flags = i10;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = userFull.birthday;
                if (!a0(this.I, this.K)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.K;
                    if (tL_birthday2 != null) {
                        userFull.flags2 |= 32;
                        userFull.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        userFull.flags2 &= -33;
                        userFull.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().invalidateContentSettings();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                }
                long j11 = this.J;
                TLRPC.Chat chat = this.L;
                if (chat != null) {
                    j10 = chat.f20344id;
                } else {
                    j10 = 0;
                }
                if (j11 != j10) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.L);
                    TLRPC.Chat chat2 = this.L;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j12 = userFull.personal_channel_id;
                        long j13 = chat2.f20344id;
                        if (j12 != j13) {
                            userFull.personal_channel_message = 0;
                        }
                        userFull.personal_channel_id = j13;
                    } else {
                        userFull.flags &= -65;
                        userFull.personal_channel_message = 0;
                        userFull.personal_channel_id = 0L;
                    }
                    arrayList.add(updatepersonalchannel);
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    getConnectionsManager().sendRequest(tLObject, new ai.f8(this, tLObject, tL_birthday, userFull, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        fg1 fg1Var = new fg1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.d = fg1Var;
        fg1Var.setDivider(true);
        fg1 fg1Var2 = this.d;
        fg1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(fg1Var2, 4);
        org.telegram.ui.Cells.f3 f3Var = fg1Var2.d;
        f3Var.setImeOptions(6);
        f3Var.setOnEditorActionListener(new m.t2(gVar, 2));
        fg1 fg1Var3 = new fg1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.e = fg1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(fg1Var3, 4);
        org.telegram.ui.Cells.f3 f3Var2 = fg1Var3.d;
        f3Var2.setImeOptions(6);
        f3Var2.setOnEditorActionListener(new m.t2(gVar2, 2));
        fg1 fg1Var4 = new fg1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.f34252f = fg1Var4;
        fg1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.f34253n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new dg1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.c71 c71Var = this.f25615a;
        this.f34258y = c71Var;
        c71Var.t1();
        this.f34258y.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.f34258y);
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21519v8;
        org.telegram.ui.ActionBar.r6.z(kVar, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f34256w = cqVar;
        this.v = new org.telegram.ui.Components.yr(mutate, cqVar);
        this.f34257x = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.v);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        org.telegram.ui.Components.a71 a71Var;
        if (!this.P) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (userFull == null) {
                getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
                return;
            }
            TLRPC.User user = userFull.user;
            if (user == null) {
                user = getUserConfig().getCurrentUser();
            }
            if (user == null) {
                return;
            }
            fg1 fg1Var = this.d;
            String str = user.first_name;
            this.F = str;
            fg1Var.setText(str);
            fg1 fg1Var2 = this.e;
            String str2 = user.last_name;
            this.G = str2;
            fg1Var2.setText(str2);
            fg1 fg1Var3 = this.f34252f;
            String str3 = userFull.about;
            this.H = str3;
            fg1Var3.setText(str3);
            TL_account.TL_birthday tL_birthday = userFull.birthday;
            this.I = tL_birthday;
            this.K = tL_birthday;
            if ((userFull.flags2 & 64) != 0) {
                this.J = userFull.personal_channel_id;
                this.L = getMessagesController().getChat(Long.valueOf(this.J));
            } else {
                this.J = 0L;
                this.L = null;
            }
            boolean z11 = false;
            if (userFull.business_work_hours != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.M = z10;
            if (userFull.business_location != null) {
                z11 = true;
            }
            this.N = z11;
            b0(true);
            org.telegram.ui.Components.c71 c71Var = this.f34258y;
            if (c71Var != null && (a71Var = c71Var.Z2) != null) {
                a71Var.N(true);
            }
            this.P = true;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            d0();
        } else if (i10 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.c71 c71Var = this.f34258y;
            if (c71Var != null) {
                c71Var.Z2.N(true);
            }
        } else if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.c71 c71Var2 = this.f34258y;
            if (c71Var2 != null) {
                c71Var2.Z2.N(true);
            }
        } else if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = ig.f.a(this.currentAccount).f12924c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f34255s = arrayList;
            org.telegram.ui.Components.c71 c71Var3 = this.f34258y;
            if (c71Var3 != null) {
                c71Var3.Z2.N(true);
            }
        }
    }

    public final void e0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UserInfoActivity.e0():void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.updatedChatbot);
        getContactsController().loadPrivacySettings();
        ig.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (!this.Q) {
            c0(false);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34258y.setPadding(0, 0, 0, i13);
        this.f34258y.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gg1 gg1Var = this.O;
        gg1Var.f37574c = false;
        gg1Var.f37575f.add(new dg1(this, 1));
        if (!gg1Var.f37574c && !gg1Var.d) {
            gg1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = gg1Var.f37573b;
            ConnectionsManager.getInstance(gg1Var.f37572a).sendRequest(tL_channels_getAdminedPublicChannels, new l(gg1Var, 24));
        }
        this.f34254r = null;
        org.telegram.ui.Components.c71 c71Var = this.f34258y;
        if (c71Var != null) {
            c71Var.Z2.N(true);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.cq cqVar = this.f34256w;
            if (cqVar != null) {
                cqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21519v8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
