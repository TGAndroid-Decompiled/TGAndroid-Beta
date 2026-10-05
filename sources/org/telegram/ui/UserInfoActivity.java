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
public class UserInfoActivity extends org.telegram.ui.Components.z61 implements NotificationCenter.NotificationCenterDelegate {
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
    public fh1 f34594e;
    public fh1 f34595f;
    public int firstNameRow;
    public fh1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence f34597r;
    public CharSequence f34598s;
    public int usernameRow;
    public org.telegram.ui.Components.sr f34599w;
    public org.telegram.ui.ActionBar.v0 f34600x;
    public org.telegram.ui.Components.y61 f34601y;
    public int f34596n = Integer.MIN_VALUE;
    public ArrayList v = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final gh1 O = new gh1(this.currentAccount);
    public boolean Q = false;
    public int R = -4;

    public static void X(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.f34599w.a(0.0f);
            boolean z10 = tLObject instanceof TL_account.updateBirthday;
            if (z10 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
                    alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                    alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    userInfoActivity.showDialog(alertDialog$Builder.f20377a);
                }
            } else {
                org.telegram.ui.Components.yc.b0(tL_error);
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
            userInfoActivity.f34599w.a(0.0f);
            org.telegram.messenger.bi.o(R.string.UnknownError, org.telegram.ui.Components.yc.a0(userInfoActivity), null);
        } else {
            userInfoActivity.Q = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
            }
        }
    }

    public static String Y(TL_account.TL_birthday tL_birthday) {
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

    public static boolean Z(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
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
    public final void S(ArrayList arrayList, org.telegram.ui.Components.w61 w61Var) {
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
        Collections.sort(arrayList2, new eb1(1));
        arrayList.add(org.telegram.ui.Components.h61.u(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h61.k(this.f34594e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h61.k(this.f34595f));
        arrayList.add(org.telegram.ui.Components.h61.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.h61.k(this.h));
        arrayList.add(org.telegram.ui.Components.h61.C(this.f34597r));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        com.google.android.gms.internal.vision.e2.n(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(u81.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.bi.g(new StringBuilder("+"), currentUser.phone, gf.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(u81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(u81.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.K;
        if (tL_birthday != null) {
            arrayList.add(u81.a(9, -14899731, -15431455, R.drawable.filled_birthday, Y(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(u81.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.f34598s == null) {
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
            this.f34598s = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new ch1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.h61.C(this.f34598s));
        this.channelRow = arrayList.size();
        if (this.L == null) {
            arrayList.add(u81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(u81.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.L.title, null));
        }
        if (this.M) {
            arrayList.add(u81.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.N) {
            arrayList.add(u81.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.v;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.v;
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
            arrayList.add(u81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        } else {
            arrayList.add(u81.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.r8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.h61.B(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        if (UserConfig.getActivatedAccountsCount() < 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i13 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i14 = hh1.f37096a;
            org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(hh1.class);
            K.d = 10;
            K.f27092k = i13;
            K.f27093l = string2;
            K.f27094m = null;
            K.f27106z = 0;
            K.f27098q = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                com.google.android.gms.internal.vision.e2.n(R.string.SettingsAccounts, arrayList);
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                int intValue = ((Integer) arrayList2.get(i15)).intValue();
                int i16 = s81.f40381a;
                org.telegram.ui.Components.h61 K2 = org.telegram.ui.Components.h61.K(s81.class);
                K2.d = i15;
                K2.f27106z = intValue;
                arrayList.add(K2);
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                if (Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount()) > 0) {
                    str = LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                arrayList.add(org.telegram.ui.Components.h61.C(TextUtils.concat(str, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new ch1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.h61.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        int i17 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i18 = hh1.f37096a;
        org.telegram.ui.Components.h61 K3 = org.telegram.ui.Components.h61.K(hh1.class);
        K3.d = 11;
        K3.f27092k = i17;
        K3.f27093l = string3;
        K3.f27094m = null;
        K3.f27106z = 0;
        K3.f27099r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.h61.B(-4, null));
    }

    @Override
    public final CharSequence T() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override
    public final void U(org.telegram.ui.Components.h61 h61Var, View view) {
        boolean z10;
        long j3;
        int i10 = 0;
        Integer num = null;
        if (h61Var.d == 10) {
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
                presentFragment(new ug0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                showDialog(new rg.k0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (h61Var.H(s81.class)) {
            int i12 = h61Var.f27106z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i12);
            }
        } else {
            int i13 = h61Var.d;
            if (i13 != 1 && i13 != 9) {
                if (i13 == 2) {
                    this.K = null;
                    org.telegram.ui.Components.y61 y61Var = this.f34601y;
                    if (y61Var != null) {
                        y61Var.f26034f3.N(true);
                    }
                    b0(true);
                    return;
                } else if (i13 == 3) {
                    TLRPC.Chat chat = this.L;
                    if (chat == null) {
                        j3 = 0;
                    } else {
                        j3 = chat.f20047id;
                    }
                    presentFragment(new tr(this.O, j3, new eh1(this, 1)));
                    return;
                } else if (i13 == 5) {
                    presentFragment(new hg.e1());
                    return;
                } else if (i13 == 4) {
                    presentFragment(new hg.g1());
                    return;
                } else if (i13 == 6) {
                    presentFragment(new hg.u0());
                    return;
                } else if (i13 == 7) {
                    presentFragment(new h(3));
                    return;
                } else if (i13 == 8) {
                    presentFragment(new sa(null));
                    return;
                } else if (i13 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.K;
            eh1 eh1Var = new eh1(this, 0);
            if (tL_birthday != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            showDialog(org.telegram.ui.Components.e5.m(parentActivity, string, string2, tL_birthday, eh1Var, null, false, z10, getResourceProvider()).f20383a);
        }
    }

    @Override
    public final boolean W(org.telegram.ui.Components.h61 h61Var, View view) {
        return false;
    }

    public final void b0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UserInfoActivity.b0(boolean):void");
    }

    public final void c0(boolean z10) {
        long j3;
        int i10;
        if (this.f34599w.f30935c <= 0.0f) {
            if (z10 && TextUtils.isEmpty(this.f34594e.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                fh1 fh1Var = this.f34594e;
                int i11 = -this.R;
                this.R = i11;
                AndroidUtilities.shakeViewSpring(fh1Var, i11);
                return;
            }
            this.f34599w.a(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.f34594e.getText()) && (!TextUtils.equals(this.F, this.f34594e.getText().toString()) || !TextUtils.equals(this.G, this.f34595f.getText().toString()) || !TextUtils.equals(this.H, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.f34594e.getText().toString();
                    currentUser.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f34595f.getText().toString();
                    currentUser.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.h.getText().toString();
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
                if (!Z(this.I, this.K)) {
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
                long j10 = this.J;
                TLRPC.Chat chat = this.L;
                if (chat != null) {
                    j3 = chat.f20047id;
                } else {
                    j3 = 0;
                }
                if (j10 != j3) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.L);
                    TLRPC.Chat chat2 = this.L;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j11 = userFull.personal_channel_id;
                        long j12 = chat2.f20047id;
                        if (j11 != j12) {
                            userFull.personal_channel_message = 0;
                        }
                        userFull.personal_channel_id = j12;
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
                    getConnectionsManager().sendRequest(tLObject, new dh1(this, tLObject, tL_birthday, userFull, iArr, arrayList, 0), 1024);
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
        setHasOwnBackground(true);
        fh1 fh1Var = new fh1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.f34594e = fh1Var;
        fh1Var.setDivider(true);
        fh1 fh1Var2 = this.f34594e;
        fh1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(fh1Var2, 4);
        org.telegram.ui.Cells.h3 h3Var = fh1Var2.f22315b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(gVar, 2));
        fh1 fh1Var3 = new fh1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.f34595f = fh1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(fh1Var3, 4);
        org.telegram.ui.Cells.h3 h3Var2 = fh1Var3.f22315b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(gVar2, 2));
        fh1 fh1Var4 = new fh1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.h = fh1Var4;
        fh1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.f34597r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new ch1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.y61 y61Var = this.f33438a;
        this.f34601y = y61Var;
        y61Var.r1();
        this.f34601y.setSectionsDrawBackground(true);
        this.f34601y.setClipToPadding(false);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 7));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.i6.f21164v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f34599w = new org.telegram.ui.Components.sr(mutate, new org.telegram.ui.Components.wp(org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
        this.f34600x = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f34599w);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        org.telegram.ui.Components.w61 w61Var;
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
            fh1 fh1Var = this.f34594e;
            String str = user.first_name;
            this.F = str;
            fh1Var.setText(str);
            fh1 fh1Var2 = this.f34595f;
            String str2 = user.last_name;
            this.G = str2;
            fh1Var2.setText(str2);
            fh1 fh1Var3 = this.h;
            String str3 = userFull.about;
            this.H = str3;
            fh1Var3.setText(str3);
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
            org.telegram.ui.Components.y61 y61Var = this.f34601y;
            if (y61Var != null && (w61Var = y61Var.f26034f3) != null) {
                w61Var.N(true);
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
            org.telegram.ui.Components.y61 y61Var = this.f34601y;
            if (y61Var != null) {
                y61Var.f26034f3.N(true);
            }
        } else if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.y61 y61Var2 = this.f34601y;
            if (y61Var2 != null) {
                y61Var2.f26034f3.N(true);
            }
        } else if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = hg.g.a(this.currentAccount).f11192c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.v = arrayList;
            org.telegram.ui.Components.y61 y61Var3 = this.f34601y;
            if (y61Var3 != null) {
                y61Var3.f26034f3.N(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.y61 y61Var;
        String str;
        int i10 = this.f34596n;
        fh1 fh1Var = this.h;
        if (fh1Var != null && !TextUtils.isEmpty(fh1Var.getText())) {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.f34597r = LocaleController.getString(R.string.Loading);
                this.f34596n = Objects.hash(1);
            } else {
                int i11 = -1;
                char c10 = 65535;
                int i12 = 0;
                int i13 = 0;
                boolean z10 = false;
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
                        boolean z11 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll;
                        if (!z11) {
                            boolean z12 = privacyRule instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (!z12 || z10) {
                                if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                    c10 = 2;
                                    z10 = true;
                                } else if (c10 == 65535) {
                                    if (!z11) {
                                        if (!z12 || z10) {
                                            c10 = 2;
                                        }
                                    }
                                }
                            }
                            c10 = 1;
                        }
                        c10 = 0;
                    }
                }
                if (c10 != 0 && (c10 != 65535 || i12 <= 0)) {
                    if (c10 != 2 && (c10 != 65535 || i12 <= 0 || i13 <= 0)) {
                        if (c10 == 1 || (c10 == 65535 && i13 > 0)) {
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
                        this.f34597r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new ch1(this, 0)), true);
                    } else {
                        this.f34597r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i12)), new ch1(this, 0)), true);
                    }
                } else if (i11 == 2) {
                    if (i12 <= 0 && i13 <= 0) {
                        this.f34597r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new ch1(this, 0)), true);
                    } else {
                        if (i13 > 0) {
                            str = hg.c.h(i13, "+");
                        } else {
                            str = "";
                        }
                        if (i12 > 0) {
                            if (str.length() > 0) {
                                str = str.concat(", ");
                            }
                            str = str + "-" + i12;
                        }
                        this.f34597r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, str), new ch1(this, 0)), true);
                    }
                } else if (i11 == 0) {
                    if (i13 <= 0) {
                        this.f34597r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new ch1(this, 0)), true);
                    } else {
                        this.f34597r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i13)), new ch1(this, 0)), true);
                    }
                } else {
                    this.f34597r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new ch1(this, 0));
                }
                this.f34596n = Objects.hash(Integer.valueOf(i11 + 10), Integer.valueOf(i13), Integer.valueOf(i12));
            }
        } else {
            this.f34597r = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.f34596n = Objects.hash(0);
        }
        if (i10 != this.f34596n && (y61Var = this.f34601y) != null) {
            y61Var.f26034f3.N(true);
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f34601y;
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
        hg.g.a(this.currentAccount).c(null);
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
    public final void onResume() {
        super.onResume();
        gh1 gh1Var = this.O;
        gh1Var.f36677c = false;
        gh1Var.f36679f.add(new ch1(this, 1));
        if (!gh1Var.f36677c && !gh1Var.d) {
            gh1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = gh1Var.f36676b;
            ConnectionsManager.getInstance(gh1Var.f36675a).sendRequest(tL_channels_getAdminedPublicChannels, new m(gh1Var, 23));
        }
        this.f34598s = null;
        org.telegram.ui.Components.y61 y61Var = this.f34601y;
        if (y61Var != null) {
            y61Var.f26034f3.N(true);
        }
    }
}
