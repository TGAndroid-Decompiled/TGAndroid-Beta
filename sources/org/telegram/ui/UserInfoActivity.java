package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
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
public class UserInfoActivity extends org.telegram.ui.Components.m71 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public String F;
    public String G;
    public TL_account.TL_birthday H;
    public long I;
    public TL_account.TL_birthday J;
    public TLRPC.Chat K;
    public boolean L;
    public boolean M;
    public boolean O;
    public int addAccountRow;
    public int bioRow;
    public int birthdayRow;
    public int channelRow;
    public ig1 e;
    public ig1 f36312f;
    public int firstNameRow;
    public ig1 h;
    public int lastNameRow;
    public int logoutRow;
    public int numberRow;
    public CharSequence f36314r;
    public CharSequence f36315s;
    public int usernameRow;
    public org.telegram.ui.ActionBar.u5 f36316w;
    public org.telegram.ui.Components.l71 f36317x;
    public int f36313n = Integer.MIN_VALUE;
    public ArrayList v = new ArrayList();
    public final ArrayList f36318y = new ArrayList();
    public final jg1 N = new jg1(this.currentAccount);
    public boolean P = false;
    public int Q = -4;

    public static void Z(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.f36316w.b(false);
            boolean z10 = tLObject instanceof TL_account.updateBirthday;
            if (z10 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
                    alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                    alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    userInfoActivity.showDialog(alertDialog$Builder.f22366a);
                }
            } else {
                org.telegram.ui.Components.wc.e0(tL_error);
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
            userInfoActivity.f36316w.b(false);
            org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(userInfoActivity), null);
        } else {
            userInfoActivity.P = true;
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                userInfoActivity.finishFragment();
            }
        }
    }

    public static String a0(TL_account.TL_birthday tL_birthday) {
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

    public static boolean b0(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
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
    public final void V(ArrayList arrayList, org.telegram.ui.Components.j71 j71Var) {
        boolean z10;
        int max;
        String str;
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.f36318y;
        arrayList2.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated() && this.currentAccount != i10) {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList2, new bv(12));
        arrayList.add(org.telegram.ui.Components.t61.u(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.t61.k(this.e));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.t61.k(this.f36312f));
        arrayList.add(org.telegram.ui.Components.t61.B(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.t61.k(this.h));
        arrayList.add(org.telegram.ui.Components.t61.C(this.f36314r));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        ic.a.p(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(z71.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.vh.g(new StringBuilder("+"), currentUser.phone, kf.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(z71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(z71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.J;
        if (tL_birthday != null) {
            arrayList.add(z71.a(9, -14899731, -15431455, R.drawable.filled_birthday, a0(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(z71.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.f36315s == null) {
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
            this.f36315s = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new gg1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.t61.C(this.f36315s));
        this.channelRow = arrayList.size();
        if (this.K == null) {
            arrayList.add(z71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(z71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.K.title, null));
        }
        if (this.L) {
            arrayList.add(z71.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.M) {
            arrayList.add(z71.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
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
            arrayList.add(z71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        } else {
            arrayList.add(z71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.v8.b(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.t61.B(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        if (UserConfig.getActivatedAccountsCount() < 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i13 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i14 = kg1.f40940a;
            org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(kg1.class);
            K.d = 10;
            K.f32871k = i13;
            K.f32872l = string2;
            K.f32873m = null;
            K.f32885z = 0;
            K.f32877q = true;
            arrayList.add(K);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                ic.a.p(R.string.SettingsAccounts, arrayList);
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                int intValue = ((Integer) arrayList2.get(i15)).intValue();
                int i16 = x71.f45686a;
                org.telegram.ui.Components.t61 K2 = org.telegram.ui.Components.t61.K(x71.class);
                K2.d = i15;
                K2.f32885z = intValue;
                arrayList.add(K2);
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                if (Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount()) > 0) {
                    str = LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                arrayList.add(org.telegram.ui.Components.t61.C(TextUtils.concat(str, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new gg1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.t61.C(null));
            }
        }
        this.logoutRow = arrayList.size();
        int i17 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i18 = kg1.f40940a;
        org.telegram.ui.Components.t61 K3 = org.telegram.ui.Components.t61.K(kg1.class);
        K3.d = 11;
        K3.f32871k = i17;
        K3.f32872l = string3;
        K3.f32873m = null;
        K3.f32885z = 0;
        K3.f32878r = true;
        arrayList.add(K3);
        arrayList.add(org.telegram.ui.Components.t61.B(-4, null));
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override
    public final void X(org.telegram.ui.Components.t61 t61Var, View view) {
        boolean z10;
        long j10;
        int i10 = 0;
        Integer num = null;
        if (t61Var.d == 10) {
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
                presentFragment(new gg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                showDialog(new tg.j0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (t61Var.H(x71.class)) {
            int i12 = t61Var.f32885z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.P0(i12);
            }
        } else {
            int i13 = t61Var.d;
            if (i13 != 1 && i13 != 9) {
                if (i13 == 2) {
                    this.J = null;
                    org.telegram.ui.Components.l71 l71Var = this.f36317x;
                    if (l71Var != null) {
                        l71Var.f32150g3.O(true);
                    }
                    c0(true);
                    return;
                } else if (i13 == 3) {
                    TLRPC.Chat chat = this.K;
                    if (chat == null) {
                        j10 = 0;
                    } else {
                        j10 = chat.f22027id;
                    }
                    presentFragment(new mr(this.N, j10, new hg1(this, 1)));
                    return;
                } else if (i13 == 5) {
                    presentFragment(new jg.d1());
                    return;
                } else if (i13 == 4) {
                    presentFragment(new jg.h1());
                    return;
                } else if (i13 == 6) {
                    presentFragment(new jg.t0());
                    return;
                } else if (i13 == 7) {
                    presentFragment(new g(3));
                    return;
                } else if (i13 == 8) {
                    presentFragment(new ta(null));
                    return;
                } else if (i13 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.r2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.J;
            hg1 hg1Var = new hg1(this, 0);
            if (tL_birthday != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            showDialog(org.telegram.ui.Components.g5.l(parentActivity, string, string2, tL_birthday, hg1Var, null, false, z10, getResourceProvider()).f22599a);
        }
    }

    @Override
    public final boolean Y(org.telegram.ui.Components.t61 t61Var, View view) {
        return false;
    }

    public final void c0(boolean z10) {
        boolean z11;
        long j10;
        if (this.f36316w == null) {
            return;
        }
        String str = this.E;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.e.getText().toString())) {
            String str3 = this.F;
            if (str3 == null) {
                str3 = "";
            }
            if (TextUtils.equals(str3, this.f36312f.getText().toString())) {
                String str4 = this.G;
                if (str4 != null) {
                    str2 = str4;
                }
                if (TextUtils.equals(str2, this.h.getText().toString()) && b0(this.H, this.J)) {
                    long j11 = this.I;
                    TLRPC.Chat chat = this.K;
                    if (chat != null) {
                        j10 = chat.f22027id;
                    } else {
                        j10 = 0;
                    }
                    if (j11 == j10) {
                        z11 = false;
                        this.f36316w.a(z11, z10);
                    }
                }
            }
        }
        z11 = true;
        this.f36316w.a(z11, z10);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        ig1 ig1Var = new ig1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.e = ig1Var;
        ig1Var.setDivider(true);
        ig1 ig1Var2 = this.e;
        ig1Var2.getClass();
        ig1Var2.d(new org.telegram.ui.Cells.g(ig1Var2, 4));
        ig1 ig1Var3 = new ig1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.f36312f = ig1Var3;
        ig1Var3.d(new org.telegram.ui.Cells.g(ig1Var3, 4));
        ig1 ig1Var4 = new ig1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.h = ig1Var4;
        ig1Var4.setShowLimitWhenEmpty(true);
        f0();
        this.f36314r = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new gg1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.l71 l71Var = this.f30417a;
        this.f36317x = l71Var;
        l71Var.u1();
        this.f36317x.setSectionsDrawBackground(true);
        this.f36317x.setClipToPadding(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 14));
        this.f36316w = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        c0(false);
        e0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        long j10;
        int i10;
        if (!this.f36316w.f23137x.f19327f) {
            if (z10 && TextUtils.isEmpty(this.e.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ig1 ig1Var = this.e;
                int i11 = -this.Q;
                this.Q = i11;
                AndroidUtilities.shakeViewSpring(ig1Var, i11);
                return;
            }
            this.f36316w.b(true);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.e.getText()) && (!TextUtils.equals(this.E, this.e.getText().toString()) || !TextUtils.equals(this.F, this.f36312f.getText().toString()) || !TextUtils.equals(this.G, this.h.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.e.getText().toString();
                    currentUser.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f36312f.getText().toString();
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
                if (!b0(this.H, this.J)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.J;
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
                long j11 = this.I;
                TLRPC.Chat chat = this.K;
                if (chat != null) {
                    j10 = chat.f22027id;
                } else {
                    j10 = 0;
                }
                if (j11 != j10) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.K);
                    TLRPC.Chat chat2 = this.K;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j12 = userFull.personal_channel_id;
                        long j13 = chat2.f22027id;
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
                    getConnectionsManager().sendRequest(tLObject, new bi.b8(this, tLObject, tL_birthday, userFull, iArr, arrayList, 2), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
        } else if (i10 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.l71 l71Var = this.f36317x;
            if (l71Var != null) {
                l71Var.f32150g3.O(true);
            }
        } else if (i10 == NotificationCenter.privacyRulesUpdated) {
            f0();
            org.telegram.ui.Components.l71 l71Var2 = this.f36317x;
            if (l71Var2 != null) {
                l71Var2.f32150g3.O(true);
            }
        } else if (i10 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = jg.f.a(this.currentAccount).f15696c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.v = arrayList;
            org.telegram.ui.Components.l71 l71Var3 = this.f36317x;
            if (l71Var3 != null) {
                l71Var3.f32150g3.O(true);
            }
        }
    }

    public final void e0() {
        boolean z10;
        org.telegram.ui.Components.j71 j71Var;
        if (!this.O) {
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
            ig1 ig1Var = this.e;
            String str = user.first_name;
            this.E = str;
            ig1Var.setText(str);
            ig1 ig1Var2 = this.f36312f;
            String str2 = user.last_name;
            this.F = str2;
            ig1Var2.setText(str2);
            ig1 ig1Var3 = this.h;
            String str3 = userFull.about;
            this.G = str3;
            ig1Var3.setText(str3);
            TL_account.TL_birthday tL_birthday = userFull.birthday;
            this.H = tL_birthday;
            this.J = tL_birthday;
            if ((userFull.flags2 & 64) != 0) {
                this.I = userFull.personal_channel_id;
                this.K = getMessagesController().getChat(Long.valueOf(this.I));
            } else {
                this.I = 0L;
                this.K = null;
            }
            boolean z11 = false;
            if (userFull.business_work_hours != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = z10;
            if (userFull.business_location != null) {
                z11 = true;
            }
            this.M = z11;
            c0(true);
            org.telegram.ui.Components.l71 l71Var = this.f36317x;
            if (l71Var != null && (j71Var = l71Var.f32150g3) != null) {
                j71Var.O(true);
            }
            this.O = true;
        }
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UserInfoActivity.f0():void");
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f36317x;
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
        jg.f.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (!this.P) {
            d0(false);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        jg1 jg1Var = this.N;
        jg1Var.f40633c = false;
        jg1Var.f40634f.add(new gg1(this, 1));
        if (!jg1Var.f40633c && !jg1Var.d) {
            jg1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = jg1Var.f40632b;
            ConnectionsManager.getInstance(jg1Var.f40631a).sendRequest(tL_channels_getAdminedPublicChannels, new l(jg1Var, 24));
        }
        this.f36315s = null;
        org.telegram.ui.Components.l71 l71Var = this.f36317x;
        if (l71Var != null) {
            l71Var.f32150g3.O(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
