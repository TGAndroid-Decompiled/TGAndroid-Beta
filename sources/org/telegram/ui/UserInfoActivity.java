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

public class UserInfoActivity extends org.telegram.ui.Components.f51 implements NotificationCenter.NotificationCenterDelegate {
    public String A;
    public String B;
    public String C;
    public TL_account.TL_birthday D;
    public long E;
    public TL_account.TL_birthday F;
    public TLRPC.Chat G;
    public boolean H;
    public boolean I;
    public boolean K;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public eg1 d;

    public eg1 f36280e;

    public eg1 f36281f;
    public int firstNameRow;
    public int lastNameRow;
    public int logoutRow;

    public CharSequence f36282n;
    public int numberRow;

    public CharSequence f36283r;
    public int usernameRow;
    public org.telegram.ui.Components.dr v;

    public org.telegram.ui.ActionBar.v0 f36285w;

    public org.telegram.ui.Components.e51 f36286x;
    public int h = Integer.MIN_VALUE;

    public ArrayList f36284s = new ArrayList();

    public final ArrayList f36287y = new ArrayList();
    public final fg1 J = new fg1(this.currentAccount);
    public boolean L = false;
    public int M = -4;

    public static void Y(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                userInfoActivity.v.a(0.0f);
                org.telegram.messenger.y1.r(R.string.UnknownError, org.telegram.ui.Components.mc.a0(userInfoActivity), null);
                return;
            }
            userInfoActivity.L = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
                return;
            }
            return;
        }
        userInfoActivity.v.a(0.0f);
        boolean z10 = tLObject instanceof TL_account.updateBirthday;
        if (!z10 || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.ui.Components.mc.b0(tL_error);
        } else if (userInfoActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            userInfoActivity.showDialog(alertDialog$Builder.f22702a);
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
    }

    public static String Z(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return LocaleController.getInstance().getFormatterDayMonth().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, tL_birthday.year);
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return LocaleController.getInstance().getFormatterBoostExpired().format(calendar2.getTimeInMillis());
    }

    public static boolean a0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
    }

    @Override
    public final void U(ArrayList arrayList, org.telegram.ui.Components.b51 b51Var) {
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.f36287y;
        arrayList2.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new org.telegram.ui.Components.lp0(15));
        arrayList.add(org.telegram.ui.Components.n41.t(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.n41.k(this.d));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.n41.k(this.f36280e));
        arrayList.add(org.telegram.ui.Components.n41.A(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.n41.k(this.f36281f));
        arrayList.add(org.telegram.ui.Components.n41.B(this.f36282n));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        org.telegram.ui.Cells.pa.o(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(t71.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.y1.k(new StringBuilder("+"), currentUser.phone, oe.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(t71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(t71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.F;
        if (tL_birthday != null) {
            arrayList.add(t71.a(9, -14899731, -15431455, R.drawable.filled_birthday, Z(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(t71.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        int i11 = 2;
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.f36283r == null) {
            String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
            if (!privacyRules.isEmpty()) {
                for (int i12 = 0; i12 < privacyRules.size(); i12++) {
                    if (privacyRules.get(i12) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        break;
                    }
                    if ((privacyRules.get(i12) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i12) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                    }
                }
            }
            this.f36283r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new cg1(this, i11)), true);
        }
        arrayList.add(org.telegram.ui.Components.n41.B(this.f36283r));
        this.channelRow = arrayList.size();
        if (this.G == null) {
            arrayList.add(t71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(t71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.G.title, null));
        }
        if (this.H) {
            arrayList.add(t71.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.I) {
            arrayList.add(t71.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.f36284s;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(t71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.l8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        } else {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.f36284s;
            int size = arrayList4.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList4.get(i13);
                i13++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(UserObject.getUserName(user));
                }
            }
            arrayList.add(t71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        }
        arrayList.add(org.telegram.ui.Components.n41.A(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z10 = UserConfig.getActivatedAccountsCount() < 4;
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i14 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i15 = ig1.f39104a;
            org.telegram.ui.Components.n41 n41VarJ = org.telegram.ui.Components.n41.J(ig1.class);
            n41VarJ.d = 10;
            n41VarJ.f30843k = i14;
            n41VarJ.f30844l = string2;
            n41VarJ.f30845m = null;
            n41VarJ.f30857z = 0;
            n41VarJ.f30849q = true;
            arrayList.add(n41VarJ);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                org.telegram.ui.Cells.pa.o(R.string.SettingsAccounts, arrayList);
            }
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                int iIntValue = ((Integer) arrayList2.get(i16)).intValue();
                int i17 = r71.f41832a;
                org.telegram.ui.Components.n41 n41VarJ2 = org.telegram.ui.Components.n41.J(r71.class);
                n41VarJ2.d = i16;
                n41VarJ2.f30857z = iIntValue;
                arrayList.add(n41VarJ2);
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                arrayList.add(org.telegram.ui.Components.n41.B(null));
            } else {
                int iMax = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                arrayList.add(org.telegram.ui.Components.n41.B(TextUtils.concat(iMax > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", iMax) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new cg1(this, 3)))));
            }
        }
        this.logoutRow = arrayList.size();
        int i18 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i19 = ig1.f39104a;
        org.telegram.ui.Components.n41 n41VarJ3 = org.telegram.ui.Components.n41.J(ig1.class);
        n41VarJ3.d = 11;
        n41VarJ3.f30843k = i18;
        n41VarJ3.f30844l = string3;
        n41VarJ3.f30845m = null;
        n41VarJ3.f30857z = 0;
        n41VarJ3.f30850r = true;
        arrayList.add(n41VarJ3);
        arrayList.add(org.telegram.ui.Components.n41.A(-4, null));
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override
    public final void W(org.telegram.ui.Components.n41 n41Var, View view) {
        int i10 = 0;
        Integer numValueOf = null;
        if (n41Var.d == 10) {
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!UserConfig.getInstance(i11).isClientActivated()) {
                    i10++;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i10--;
            }
            if (i10 > 0 && numValueOf != null) {
                presentFragment(new ig0(numValueOf.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new ag.i1(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (n41Var.G(r71.class)) {
            int i12 = n41Var.f30857z;
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.K0(i12);
                return;
            }
            return;
        }
        int i13 = n41Var.d;
        if (i13 == 1 || i13 == 9) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.F;
            showDialog(org.telegram.ui.Components.y4.m(parentActivity, string, string2, tL_birthday, new dg1(this, 0), null, false, tL_birthday != null, getResourceProvider()).f23994a);
            return;
        }
        if (i13 == 2) {
            this.F = null;
            org.telegram.ui.Components.e51 e51Var = this.f36286x;
            if (e51Var != null) {
                e51Var.U2.N(true);
            }
            b0(true);
            return;
        }
        if (i13 == 3) {
            TLRPC.Chat chat = this.G;
            long j10 = chat == null ? 0L : chat.f22380id;
            dg1 dg1Var = new dg1(this, 1);
            hg1 hg1Var = new hg1();
            hg1Var.f38818r = false;
            fg1 fg1Var = this.J;
            hg1Var.d = fg1Var;
            hg1Var.f38815e = j10;
            hg1Var.f38816f = dg1Var;
            gg1 gg1Var = new gg1(hg1Var, 1);
            if (fg1Var.f38130c) {
                gg1Var.run();
            } else {
                fg1Var.f38132f.add(gg1Var);
            }
            presentFragment(hg1Var);
            return;
        }
        if (i13 == 5) {
            presentFragment(new qf.w0());
            return;
        }
        if (i13 == 4) {
            presentFragment(new qf.y0());
            return;
        }
        if (i13 == 6) {
            presentFragment(new qf.m0());
            return;
        }
        if (i13 == 7) {
            presentFragment(new h(3));
        } else if (i13 == 8) {
            presentFragment(new na(null));
        } else if (i13 == 11) {
            presentFragment(new kg0(null));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.n41 n41Var, View view) {
        return false;
    }

    public final void b0(boolean z10) {
        boolean z11;
        if (this.f36285w == null) {
            return;
        }
        String str = this.A;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.d.getText().toString())) {
            String str2 = this.B;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.equals(str2, this.f36280e.getText().toString())) {
                String str3 = this.C;
                if (TextUtils.equals(str3 != null ? str3 : "", this.f36281f.getText().toString()) && a0(this.D, this.F)) {
                    long j10 = this.E;
                    TLRPC.Chat chat = this.G;
                    if (j10 != (chat != null ? chat.f22380id : 0L)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = true;
                }
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        this.f36285w.setEnabled(z11);
        if (z10) {
            this.f36285w.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.0f).scaleY(z11 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f36285w.setAlpha(z11 ? 1.0f : 0.0f);
        this.f36285w.setScaleX(z11 ? 1.0f : 0.0f);
        this.f36285w.setScaleY(z11 ? 1.0f : 0.0f);
    }

    public final void c0(boolean z10) {
        if (this.v.f27834c <= 0.0f) {
            if (z10 && TextUtils.isEmpty(this.d.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                eg1 eg1Var = this.d;
                int i10 = -this.M;
                this.M = i10;
                AndroidUtilities.shakeViewSpring(eg1Var, i10);
                return;
            }
            this.v.a(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.d.getText()) && (!TextUtils.equals(this.A, this.d.getText().toString()) || !TextUtils.equals(this.B, this.f36280e.getText().toString()) || !TextUtils.equals(this.C, this.f36281f.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String string = this.d.getText().toString();
                    currentUser.first_name = string;
                    updateprofile.first_name = string;
                    updateprofile.flags |= 2;
                    String string2 = this.f36280e.getText().toString();
                    currentUser.last_name = string2;
                    updateprofile.last_name = string2;
                    updateprofile.flags |= 4;
                    String string3 = this.f36281f.getText().toString();
                    userFull.about = string3;
                    updateprofile.about = string3;
                    userFull.flags = TextUtils.isEmpty(string3) ? userFull.flags & (-3) : userFull.flags | 2;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = userFull.birthday;
                if (!a0(this.D, this.F)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.F;
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
                long j10 = this.E;
                TLRPC.Chat chat = this.G;
                if (j10 != (chat != null ? chat.f22380id : 0L)) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.G);
                    TLRPC.Chat chat2 = this.G;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j11 = userFull.personal_channel_id;
                        long j12 = chat2.f22380id;
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
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLObject tLObject = (TLObject) arrayList.get(i11);
                    getConnectionsManager().sendRequest(tLObject, new cg.j0(this, tLObject, tL_birthday, userFull, iArr, arrayList, 4), 1024);
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
        eg1 eg1Var = new eg1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.d = eg1Var;
        eg1Var.setDivider(true);
        eg1 eg1Var2 = this.d;
        eg1Var2.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(eg1Var2, 4);
        org.telegram.ui.Cells.e3 e3Var = eg1Var2.f24370b;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new m.u2(gVar, 2));
        eg1 eg1Var3 = new eg1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.f36280e = eg1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(eg1Var3, 4);
        org.telegram.ui.Cells.e3 e3Var2 = eg1Var3.f24370b;
        e3Var2.setImeOptions(6);
        e3Var2.setOnEditorActionListener(new m.u2(gVar2, 2));
        eg1 eg1Var4 = new eg1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.f36281f = eg1Var4;
        eg1Var4.setShowLimitWhenEmpty(true);
        e0();
        this.f36282n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new cg1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.e51 e51Var = this.f28261a;
        this.f36286x = e51Var;
        e51Var.p1();
        this.f36286x.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.f36286x);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ed1(3, this));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.f23375v8;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.v = new org.telegram.ui.Components.dr(drawableMutate, new org.telegram.ui.Components.hp(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.f36285w = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.v);
        b0(false);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.Components.b51 b51Var;
        if (this.K) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.User currentUser = userFull.user;
        if (currentUser == null) {
            currentUser = getUserConfig().getCurrentUser();
        }
        if (currentUser == null) {
            return;
        }
        eg1 eg1Var = this.d;
        String str = currentUser.first_name;
        this.A = str;
        eg1Var.setText(str);
        eg1 eg1Var2 = this.f36280e;
        String str2 = currentUser.last_name;
        this.B = str2;
        eg1Var2.setText(str2);
        eg1 eg1Var3 = this.f36281f;
        String str3 = userFull.about;
        this.C = str3;
        eg1Var3.setText(str3);
        TL_account.TL_birthday tL_birthday = userFull.birthday;
        this.D = tL_birthday;
        this.F = tL_birthday;
        if ((userFull.flags2 & 64) != 0) {
            this.E = userFull.personal_channel_id;
            this.G = getMessagesController().getChat(Long.valueOf(this.E));
        } else {
            this.E = 0L;
            this.G = null;
        }
        this.H = userFull.business_work_hours != null;
        this.I = userFull.business_location != null;
        b0(true);
        org.telegram.ui.Components.e51 e51Var = this.f36286x;
        if (e51Var != null && (b51Var = e51Var.U2) != null) {
            b51Var.N(true);
        }
        this.K = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            d0();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.e51 e51Var = this.f36286x;
            if (e51Var != null) {
                e51Var.U2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            e0();
            org.telegram.ui.Components.e51 e51Var2 = this.f36286x;
            if (e51Var2 != null) {
                e51Var2.U2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = qf.h.a(this.currentAccount).f46311c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f36284s = arrayList;
            org.telegram.ui.Components.e51 e51Var3 = this.f36286x;
            if (e51Var3 != null) {
                e51Var3.U2.N(true);
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.e51 e51Var;
        int i10 = this.h;
        eg1 eg1Var = this.f36281f;
        int i11 = 0;
        if (eg1Var == null || TextUtils.isEmpty(eg1Var.getText())) {
            this.f36282n = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.h = Objects.hash(0);
        } else {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.f36282n = LocaleController.getString(R.string.Loading);
                this.h = Objects.hash(1);
            } else {
                int i12 = -1;
                byte b10 = -1;
                int size = 0;
                int size2 = 0;
                boolean z10 = false;
                for (int i13 = 0; i13 < privacyRules.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size3 = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i14 = 0; i14 < size3; i14++) {
                            TLRPC.Chat chat = getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i14));
                            if (chat != null) {
                                size2 = Math.max(0, chat.participants_count - 1) + size2;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size4 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i15 = 0; i15 < size4; i15++) {
                            TLRPC.Chat chat2 = getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i15));
                            if (chat2 != null) {
                                size = Math.max(0, chat2.participants_count - 1) + size;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        size2 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        size += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                    } else {
                        boolean z11 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll;
                        if (z11) {
                            b10 = 0;
                        } else {
                            boolean z12 = privacyRule instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (z12 && !z10) {
                                b10 = 1;
                            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                b10 = 2;
                                z10 = true;
                            } else if (b10 == -1) {
                                if (z11) {
                                    b10 = 0;
                                } else if (!z12 || z10) {
                                    b10 = 2;
                                } else {
                                    b10 = 1;
                                }
                            }
                        }
                    }
                }
                if (b10 == 0 || (b10 == -1 && size > 0)) {
                    i12 = 0;
                } else if (b10 == 2 || (b10 == -1 && size > 0 && size2 > 0)) {
                    i12 = 2;
                } else if (b10 == 1 || (b10 == -1 && size2 > 0)) {
                    i12 = 1;
                }
                if (i12 == 0) {
                    if (size <= 0) {
                        this.f36282n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new cg1(this, i11)), true);
                    } else {
                        this.f36282n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(size)), new cg1(this, i11)), true);
                    }
                } else if (i12 == 2) {
                    if (size > 0 || size2 > 0) {
                        String strK = size2 > 0 ? i0.a.k(size2, "+") : "";
                        if (size > 0) {
                            if (strK.length() > 0) {
                                strK = strK.concat(", ");
                            }
                            strK = strK + "-" + size;
                        }
                        this.f36282n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, strK), new cg1(this, i11)), true);
                    } else {
                        this.f36282n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new cg1(this, i11)), true);
                    }
                } else if (i12 != 0) {
                    this.f36282n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new cg1(this, i11));
                } else if (size2 <= 0) {
                    this.f36282n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new cg1(this, i11)), true);
                } else {
                    this.f36282n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(size2)), new cg1(this, i11)), true);
                }
                this.h = Objects.hash(Integer.valueOf(i12 + 10), Integer.valueOf(size2), Integer.valueOf(size));
            }
        }
        if (i10 == this.h || (e51Var = this.f36286x) == null) {
            return;
        }
        e51Var.U2.N(true);
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
        qf.h.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (this.L) {
            return;
        }
        c0(false);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36286x.setPadding(0, 0, 0, i13);
        this.f36286x.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg1 fg1Var = this.J;
        fg1Var.f38130c = false;
        fg1Var.f38132f.add(new cg1(this, 1));
        if (!fg1Var.f38130c && !fg1Var.d) {
            fg1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = fg1Var.f38129b;
            ConnectionsManager.getInstance(fg1Var.f38128a).sendRequest(tL_channels_getAdminedPublicChannels, new n(fg1Var, 23));
        }
        this.f36283r = null;
        org.telegram.ui.Components.e51 e51Var = this.f36286x;
        if (e51Var != null) {
            e51Var.U2.N(true);
        }
    }
}
