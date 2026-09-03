package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
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
public class UserInfoActivity extends org.telegram.ui.Components.b61 implements NotificationCenter.NotificationCenterDelegate {
    public String B;
    public String C;
    public String D;
    public TL_account.TL_birthday E;
    public long F;
    public TL_account.TL_birthday G;
    public TLRPC.Chat H;
    public boolean I;
    public boolean J;
    public boolean L;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public ah1 d;
    public ah1 f34922e;
    public ah1 f34923f;
    public int firstNameRow;
    public int lastNameRow;
    public int logoutRow;
    public CharSequence f34924n;
    public int numberRow;
    public CharSequence f34925r;
    public int usernameRow;
    public org.telegram.ui.Components.or v;
    public org.telegram.ui.ActionBar.w0 f34927w;
    public org.telegram.ui.Components.a61 f34928x;
    public int h = Integer.MIN_VALUE;
    public ArrayList f34926s = new ArrayList();
    public final ArrayList f34929y = new ArrayList();
    public final ch1 K = new ch1(this.currentAccount);
    public boolean M = false;
    public int N = -4;

    public static void Y(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.v.a(0.0f);
            boolean z4 = tLObject instanceof TL_account.updateBirthday;
            if (z4 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    userInfoActivity.showDialog(alertDialog$Builder.f21168a);
                }
            } else {
                org.telegram.ui.Components.qc.b0(tL_error);
            }
            if (z4) {
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
            org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(userInfoActivity), null);
        } else {
            userInfoActivity.M = true;
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
        boolean z4;
        boolean z10;
        if (tL_birthday == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tL_birthday2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 == z10 || (tL_birthday != null && (tL_birthday.day != tL_birthday2.day || tL_birthday.month != tL_birthday2.month || tL_birthday.year != tL_birthday2.year))) {
            return false;
        }
        return true;
    }

    @Override
    public final void U(ArrayList arrayList, org.telegram.ui.Components.w51 w51Var) {
        boolean z4;
        int max;
        String str;
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.f34929y;
        arrayList2.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new du(12));
        arrayList.add(org.telegram.ui.Components.h51.t(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h51.k(this.d));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h51.k(this.f34922e));
        arrayList.add(org.telegram.ui.Components.h51.A(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h51.k(this.f34923f));
        arrayList.add(org.telegram.ui.Components.h51.B(this.f34924n));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        yh.r(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(r81.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.y3.j(new StringBuilder("+"), currentUser.phone, se.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(r81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(r81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.G;
        if (tL_birthday != null) {
            arrayList.add(r81.a(9, -14899731, -15431455, R.drawable.filled_birthday, Z(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(r81.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.f34925r == null) {
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
            this.f34925r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new yg1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.h51.B(this.f34925r));
        this.channelRow = arrayList.size();
        if (this.H == null) {
            arrayList.add(r81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(r81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.H.title, null));
        }
        if (this.I) {
            arrayList.add(r81.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.J) {
            arrayList.add(r81.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.f34926s;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList4 = this.f34926s;
            int size = arrayList4.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList4.get(i12);
                i12++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(UserObject.getUserName(user));
                }
            }
            arrayList.add(r81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb, null));
        } else {
            arrayList.add(r81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.o8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.h51.A(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        if (UserConfig.getActivatedAccountsCount() < 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.addAccountRow = arrayList.size();
            int i13 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i14 = fh1.f36804a;
            org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(fh1.class);
            J.d = 10;
            J.f27374k = i13;
            J.f27375l = string2;
            J.f27376m = null;
            J.f27388z = 0;
            J.f27380q = true;
            arrayList.add(J);
        }
        if (!arrayList2.isEmpty()) {
            if (!z4) {
                yh.r(R.string.SettingsAccounts, arrayList);
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                int intValue = ((Integer) arrayList2.get(i15)).intValue();
                int i16 = p81.f39919a;
                org.telegram.ui.Components.h51 J2 = org.telegram.ui.Components.h51.J(p81.class);
                J2.d = i15;
                J2.f27388z = intValue;
                arrayList.add(J2);
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                if (Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount()) > 0) {
                    str = LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                arrayList.add(org.telegram.ui.Components.h51.B(TextUtils.concat(str, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new yg1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.h51.B(null));
            }
        }
        this.logoutRow = arrayList.size();
        int i17 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i18 = fh1.f36804a;
        org.telegram.ui.Components.h51 J3 = org.telegram.ui.Components.h51.J(fh1.class);
        J3.d = 11;
        J3.f27374k = i17;
        J3.f27375l = string3;
        J3.f27376m = null;
        J3.f27388z = 0;
        J3.f27381r = true;
        arrayList.add(J3);
        arrayList.add(org.telegram.ui.Components.h51.A(-4, null));
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override
    public final void W(org.telegram.ui.Components.h51 h51Var, View view) {
        boolean z4;
        long j10;
        int i10 = 0;
        Integer num = null;
        if (h51Var.d == 10) {
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
                presentFragment(new og0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                showDialog(new fg.v0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (h51Var.G(p81.class)) {
            int i12 = h51Var.f27388z;
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.K0(i12);
            }
        } else {
            int i13 = h51Var.d;
            if (i13 != 1 && i13 != 9) {
                if (i13 == 2) {
                    this.G = null;
                    org.telegram.ui.Components.a61 a61Var = this.f34928x;
                    if (a61Var != null) {
                        a61Var.V2.N(true);
                    }
                    b0(true);
                    return;
                } else if (i13 == 3) {
                    TLRPC.Chat chat = this.H;
                    if (chat == null) {
                        j10 = 0;
                    } else {
                        j10 = chat.f20845id;
                    }
                    zg1 zg1Var = new zg1(this, 1);
                    ?? b61Var = new org.telegram.ui.Components.b61();
                    b61Var.f36502r = false;
                    ch1 ch1Var = this.K;
                    b61Var.d = ch1Var;
                    b61Var.f36499e = j10;
                    b61Var.f36500f = zg1Var;
                    dh1 dh1Var = new dh1(b61Var, 1);
                    if (ch1Var.f35811c) {
                        dh1Var.run();
                    } else {
                        ch1Var.f35813f.add(dh1Var);
                    }
                    presentFragment((org.telegram.ui.ActionBar.p2) b61Var);
                    return;
                } else if (i13 == 5) {
                    presentFragment(new vf.v0());
                    return;
                } else if (i13 == 4) {
                    presentFragment(new vf.x0());
                    return;
                } else if (i13 == 6) {
                    presentFragment(new vf.l0());
                    return;
                } else if (i13 == 7) {
                    presentFragment(new i(3));
                    return;
                } else if (i13 == 8) {
                    presentFragment(new pa(null));
                    return;
                } else if (i13 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.p2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.G;
            zg1 zg1Var2 = new zg1(this, 0);
            if (tL_birthday != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            showDialog(org.telegram.ui.Components.z4.m(parentActivity, string, string2, tL_birthday, zg1Var2, null, false, z4, getResourceProvider()).f21209a);
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.h51 h51Var, View view) {
        return false;
    }

    public final void b0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UserInfoActivity.b0(boolean):void");
    }

    public final void c0(boolean z4) {
        long j10;
        int i10;
        if (this.v.f29874c <= 0.0f) {
            if (z4 && TextUtils.isEmpty(this.d.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ah1 ah1Var = this.d;
                int i11 = -this.N;
                this.N = i11;
                AndroidUtilities.shakeViewSpring(ah1Var, i11);
                return;
            }
            this.v.a(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.d.getText()) && (!TextUtils.equals(this.B, this.d.getText().toString()) || !TextUtils.equals(this.C, this.f34922e.getText().toString()) || !TextUtils.equals(this.D, this.f34923f.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.d.getText().toString();
                    currentUser.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f34922e.getText().toString();
                    currentUser.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.f34923f.getText().toString();
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
                if (!a0(this.E, this.G)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.G;
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
                long j11 = this.F;
                TLRPC.Chat chat = this.H;
                if (chat != null) {
                    j10 = chat.f20845id;
                } else {
                    j10 = 0;
                }
                if (j11 != j10) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.H);
                    TLRPC.Chat chat2 = this.H;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j12 = userFull.personal_channel_id;
                        long j13 = chat2.f20845id;
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
                    getConnectionsManager().sendRequest(tLObject, new hg.i0(this, tLObject, tL_birthday, userFull, iArr, arrayList, 4), 1024);
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
        ah1 ah1Var = new ah1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.d = ah1Var;
        ah1Var.setDivider(true);
        ah1 ah1Var2 = this.d;
        ah1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(ah1Var2, 4);
        org.telegram.ui.Cells.g3 g3Var = ah1Var2.f22957b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.t2(gVar, 2));
        ah1 ah1Var3 = new ah1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.f34922e = ah1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(ah1Var3, 4);
        org.telegram.ui.Cells.g3 g3Var2 = ah1Var3.f22957b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.t2(gVar2, 2));
        ah1 ah1Var4 = new ah1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.f34923f = ah1Var4;
        ah1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.f34924n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new yg1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.a61 a61Var = this.f25523a;
        this.f34928x = a61Var;
        a61Var.o1();
        this.f34928x.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.f34928x);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 24));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.k6.f21983v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.v = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        this.f34927w = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.v);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z4;
        org.telegram.ui.Components.w51 w51Var;
        if (!this.L) {
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
            ah1 ah1Var = this.d;
            String str = user.first_name;
            this.B = str;
            ah1Var.setText(str);
            ah1 ah1Var2 = this.f34922e;
            String str2 = user.last_name;
            this.C = str2;
            ah1Var2.setText(str2);
            ah1 ah1Var3 = this.f34923f;
            String str3 = userFull.about;
            this.D = str3;
            ah1Var3.setText(str3);
            TL_account.TL_birthday tL_birthday = userFull.birthday;
            this.E = tL_birthday;
            this.G = tL_birthday;
            if ((userFull.flags2 & 64) != 0) {
                this.F = userFull.personal_channel_id;
                this.H = getMessagesController().getChat(Long.valueOf(this.F));
            } else {
                this.F = 0L;
                this.H = null;
            }
            boolean z10 = false;
            if (userFull.business_work_hours != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.I = z4;
            if (userFull.business_location != null) {
                z10 = true;
            }
            this.J = z10;
            b0(true);
            org.telegram.ui.Components.a61 a61Var = this.f34928x;
            if (a61Var != null && (w51Var = a61Var.V2) != null) {
                w51Var.N(true);
            }
            this.L = true;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            d0();
        } else if (i10 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.a61 a61Var = this.f34928x;
            if (a61Var != null) {
                a61Var.V2.N(true);
            }
        } else if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.a61 a61Var2 = this.f34928x;
            if (a61Var2 != null) {
                a61Var2.V2.N(true);
            }
        } else if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = vf.f.a(this.currentAccount).f49079c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f34926s = arrayList;
            org.telegram.ui.Components.a61 a61Var3 = this.f34928x;
            if (a61Var3 != null) {
                a61Var3.V2.N(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.a61 a61Var;
        String str;
        int i10 = this.h;
        ah1 ah1Var = this.f34923f;
        if (ah1Var != null && !TextUtils.isEmpty(ah1Var.getText())) {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.f34924n = LocaleController.getString(R.string.Loading);
                this.h = Objects.hash(1);
            } else {
                int i11 = -1;
                char c3 = 65535;
                int i12 = 0;
                int i13 = 0;
                boolean z4 = false;
                for (int i14 = 0; i14 < privacyRules.size(); i14++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i14);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            TLRPC.Chat chat = getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i15));
                            if (chat != null) {
                                i13 = Math.max(0, chat.participants_count - 1) + i13;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            TLRPC.Chat chat2 = getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i16));
                            if (chat2 != null) {
                                i12 = Math.max(0, chat2.participants_count - 1) + i12;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        i13 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        i12 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                    } else {
                        boolean z10 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll;
                        if (!z10) {
                            boolean z11 = privacyRule instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (!z11 || z4) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                    c3 = 2;
                                    z4 = true;
                                } else if (c3 == 65535) {
                                    if (!z10) {
                                        if (!z11 || z4) {
                                            c3 = 2;
                                        }
                                    }
                                }
                            }
                            c3 = 1;
                        }
                        c3 = 0;
                    }
                }
                if (c3 != 0 && (c3 != 65535 || i12 <= 0)) {
                    if (c3 != 2 && (c3 != 65535 || i12 <= 0 || i13 <= 0)) {
                        if (c3 == 1 || (c3 == 65535 && i13 > 0)) {
                            i11 = 1;
                        }
                    } else {
                        i11 = 2;
                    }
                } else {
                    i11 = 0;
                }
                if (i11 == 0) {
                    if (i12 <= 0) {
                        this.f34924n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new yg1(this, 0)), true);
                    } else {
                        this.f34924n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i12)), new yg1(this, 0)), true);
                    }
                } else if (i11 == 2) {
                    if (i12 <= 0 && i13 <= 0) {
                        this.f34924n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new yg1(this, 0)), true);
                    } else {
                        if (i13 > 0) {
                            str = l.d.j(i13, "+");
                        } else {
                            str = "";
                        }
                        if (i12 > 0) {
                            if (str.length() > 0) {
                                str = str.concat(", ");
                            }
                            str = str + "-" + i12;
                        }
                        this.f34924n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, str), new yg1(this, 0)), true);
                    }
                } else if (i11 == 0) {
                    if (i13 <= 0) {
                        this.f34924n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new yg1(this, 0)), true);
                    } else {
                        this.f34924n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i13)), new yg1(this, 0)), true);
                    }
                } else {
                    this.f34924n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new yg1(this, 0));
                }
                this.h = Objects.hash(Integer.valueOf(i11 + 10), Integer.valueOf(i13), Integer.valueOf(i12));
            }
        } else {
            this.f34924n = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.h = Objects.hash(0);
        }
        if (i10 != this.h && (a61Var = this.f34928x) != null) {
            a61Var.V2.N(true);
        }
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
        vf.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (!this.M) {
            c0(false);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34928x.setPadding(0, 0, 0, i13);
        this.f34928x.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ch1 ch1Var = this.K;
        ch1Var.f35811c = false;
        ch1Var.f35813f.add(new yg1(this, 1));
        if (!ch1Var.f35811c && !ch1Var.d) {
            ch1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = ch1Var.f35810b;
            ConnectionsManager.getInstance(ch1Var.f35809a).sendRequest(tL_channels_getAdminedPublicChannels, new o(ch1Var, 23));
        }
        this.f34925r = null;
        org.telegram.ui.Components.a61 a61Var = this.f34928x;
        if (a61Var != null) {
            a61Var.V2.N(true);
        }
    }
}
