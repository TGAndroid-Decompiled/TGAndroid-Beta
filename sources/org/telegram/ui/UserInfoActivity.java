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
public class UserInfoActivity extends org.telegram.ui.Components.d51 implements NotificationCenter.NotificationCenterDelegate {
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
    public fg1 d;
    public fg1 f36277e;
    public fg1 f36278f;
    public int firstNameRow;
    public int lastNameRow;
    public int logoutRow;
    public CharSequence f36279n;
    public int numberRow;
    public CharSequence f36280r;
    public int usernameRow;
    public org.telegram.ui.Components.fr v;
    public org.telegram.ui.ActionBar.w0 f36282w;
    public org.telegram.ui.Components.c51 f36283x;
    public int h = Integer.MIN_VALUE;
    public ArrayList f36281s = new ArrayList();
    public final ArrayList f36284y = new ArrayList();
    public final gg1 J = new gg1(this.currentAccount);
    public boolean L = false;
    public int M = -4;

    public static void X(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            userInfoActivity.v.a(0.0f);
            boolean z10 = tLObject instanceof TL_account.updateBirthday;
            if (z10 && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (userInfoActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(userInfoActivity.getParentActivity(), 0, userInfoActivity.resourceProvider);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    userInfoActivity.showDialog(alertDialog$Builder.f22702a);
                }
            } else {
                org.telegram.ui.Components.oc.b0(tL_error);
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
            org.telegram.messenger.ll.p(R.string.UnknownError, org.telegram.ui.Components.oc.a0(userInfoActivity), null);
        } else {
            userInfoActivity.L = true;
            int i9 = iArr[0] + 1;
            iArr[0] = i9;
            if (i9 == arrayList.size()) {
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
    public final void T(ArrayList arrayList, org.telegram.ui.Components.z41 z41Var) {
        boolean z10;
        int max;
        String str;
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        this.addAccountRow = -1;
        this.numberRow = -1;
        ArrayList arrayList2 = this.f36284y;
        arrayList2.clear();
        for (int i9 = 0; i9 < 4; i9++) {
            if (UserConfig.getInstance(i9).isClientActivated() && this.currentAccount != i9) {
                arrayList2.add(Integer.valueOf(i9));
            }
        }
        Collections.sort(arrayList2, new org.telegram.ui.Components.jn0(17));
        arrayList.add(org.telegram.ui.Components.l41.t(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l41.k(this.d));
        this.lastNameRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l41.k(this.f36277e));
        arrayList.add(org.telegram.ui.Components.l41.A(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(org.telegram.ui.Components.l41.k(this.f36278f));
        arrayList.add(org.telegram.ui.Components.l41.B(this.f36279n));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        org.telegram.ui.Cells.j2.l(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            arrayList.add(v71.a(7, -11154873, -14175180, R.drawable.settings_calls, org.telegram.messenger.ll.g(new StringBuilder("+"), currentUser.phone, ne.b.c()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(v71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(v71.a(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.F;
        if (tL_birthday != null) {
            arrayList.add(v71.a(9, -14899731, -15431455, R.drawable.filled_birthday, Y(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(v71.a(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.f36280r == null) {
            String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
            if (!privacyRules.isEmpty()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= privacyRules.size()) {
                        break;
                    } else if (privacyRules.get(i10) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        break;
                    } else {
                        if ((privacyRules.get(i10) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i10) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                            string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                        }
                        i10++;
                    }
                }
            }
            this.f36280r = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new dg1(this, 2)), true);
        }
        arrayList.add(org.telegram.ui.Components.l41.B(this.f36280r));
        this.channelRow = arrayList.size();
        if (this.G == null) {
            arrayList.add(v71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(v71.a(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.G.title, null));
        }
        if (this.H) {
            arrayList.add(v71.a(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.I) {
            arrayList.add(v71.a(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.f36281s;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList4 = this.f36281s;
            int size = arrayList4.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList4.get(i11);
                i11++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(UserObject.getUserName(user));
                }
            }
            arrayList.add(v71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb2, null));
        } else {
            arrayList.add(v71.a(6, -3903756, -6335009, R.drawable.premium_ai_editor, org.telegram.ui.Cells.p8.a(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        }
        arrayList.add(org.telegram.ui.Components.l41.A(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        if (UserConfig.getActivatedAccountsCount() < 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.addAccountRow = arrayList.size();
            int i12 = R.drawable.outline_add_account;
            String string2 = LocaleController.getString(R.string.AddAccount);
            int i13 = jg1.f39500a;
            org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(jg1.class);
            J.d = 10;
            J.f30338k = i12;
            J.f30339l = string2;
            J.f30340m = null;
            J.f30352z = 0;
            J.f30344q = true;
            arrayList.add(J);
        }
        if (!arrayList2.isEmpty()) {
            if (!z10) {
                org.telegram.ui.Cells.j2.l(R.string.SettingsAccounts, arrayList);
            }
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                int intValue = ((Integer) arrayList2.get(i14)).intValue();
                int i15 = t71.f42885a;
                org.telegram.ui.Components.l41 J2 = org.telegram.ui.Components.l41.J(t71.class);
                J2.d = i14;
                J2.f30352z = intValue;
                arrayList.add(J2);
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                if (Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount()) > 0) {
                    str = LocaleController.formatPluralStringComma("AddAccountInfo1", max) + " ";
                } else {
                    str = "";
                }
                arrayList.add(org.telegram.ui.Components.l41.B(TextUtils.concat(str, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new dg1(this, 3)))));
            } else {
                arrayList.add(org.telegram.ui.Components.l41.B(null));
            }
        }
        this.logoutRow = arrayList.size();
        int i16 = R.drawable.msg_leave;
        String string3 = LocaleController.getString(R.string.LogOut);
        int i17 = jg1.f39500a;
        org.telegram.ui.Components.l41 J3 = org.telegram.ui.Components.l41.J(jg1.class);
        J3.d = 11;
        J3.f30338k = i16;
        J3.f30339l = string3;
        J3.f30340m = null;
        J3.f30352z = 0;
        J3.f30345r = true;
        arrayList.add(J3);
        arrayList.add(org.telegram.ui.Components.l41.A(-4, null));
    }

    @Override
    public final CharSequence U() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override
    public final void V(org.telegram.ui.Components.l41 l41Var, View view) {
        boolean z10;
        long j10;
        int i9 = 0;
        Integer num = null;
        if (l41Var.d == 10) {
            for (int i10 = 3; i10 >= 0; i10--) {
                if (!UserConfig.getInstance(i10).isClientActivated()) {
                    i9++;
                    if (num == null) {
                        num = Integer.valueOf(i10);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i9--;
            }
            if (i9 > 0 && num != null) {
                presentFragment(new fg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                showDialog(new zf.j0(7, this.currentAccount, getParentActivity(), this, null));
            }
        } else if (l41Var.G(t71.class)) {
            int i11 = l41Var.f30352z;
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.K0(i11);
            }
        } else {
            int i12 = l41Var.d;
            if (i12 != 1 && i12 != 9) {
                if (i12 == 2) {
                    this.F = null;
                    org.telegram.ui.Components.c51 c51Var = this.f36283x;
                    if (c51Var != null) {
                        c51Var.U2.N(true);
                    }
                    a0(true);
                    return;
                } else if (i12 == 3) {
                    TLRPC.Chat chat = this.G;
                    if (chat == null) {
                        j10 = 0;
                    } else {
                        j10 = chat.f22380id;
                    }
                    eg1 eg1Var = new eg1(this, 1);
                    ?? d51Var = new org.telegram.ui.Components.d51();
                    d51Var.f39154r = false;
                    gg1 gg1Var = this.J;
                    d51Var.d = gg1Var;
                    d51Var.f39151e = j10;
                    d51Var.f39152f = eg1Var;
                    hg1 hg1Var = new hg1(d51Var, 1);
                    if (gg1Var.f38541c) {
                        hg1Var.run();
                    } else {
                        gg1Var.f38543f.add(hg1Var);
                    }
                    presentFragment((org.telegram.ui.ActionBar.o2) d51Var);
                    return;
                } else if (i12 == 5) {
                    presentFragment(new pf.w0());
                    return;
                } else if (i12 == 4) {
                    presentFragment(new pf.y0());
                    return;
                } else if (i12 == 6) {
                    presentFragment(new pf.m0());
                    return;
                } else if (i12 == 7) {
                    presentFragment(new h(3));
                    return;
                } else if (i12 == 8) {
                    presentFragment(new ma(null));
                    return;
                } else if (i12 == 11) {
                    presentFragment(new org.telegram.ui.ActionBar.o2(null));
                    return;
                } else {
                    return;
                }
            }
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.F;
            eg1 eg1Var2 = new eg1(this, 0);
            if (tL_birthday != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            showDialog(org.telegram.ui.Components.y4.m(parentActivity, string, string2, tL_birthday, eg1Var2, null, false, z10, getResourceProvider()).f22713a);
        }
    }

    @Override
    public final boolean W(org.telegram.ui.Components.l41 l41Var, View view) {
        return false;
    }

    public final void a0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.UserInfoActivity.a0(boolean):void");
    }

    public final void b0(boolean z10) {
        long j10;
        int i9;
        if (this.v.f28558c <= 0.0f) {
            if (z10 && TextUtils.isEmpty(this.d.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                fg1 fg1Var = this.d;
                int i10 = -this.M;
                this.M = i10;
                AndroidUtilities.shakeViewSpring(fg1Var, i10);
                return;
            }
            this.v.a(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.d.getText()) && (!TextUtils.equals(this.A, this.d.getText().toString()) || !TextUtils.equals(this.B, this.f36277e.getText().toString()) || !TextUtils.equals(this.C, this.f36278f.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String charSequence = this.d.getText().toString();
                    currentUser.first_name = charSequence;
                    updateprofile.first_name = charSequence;
                    updateprofile.flags |= 2;
                    String charSequence2 = this.f36277e.getText().toString();
                    currentUser.last_name = charSequence2;
                    updateprofile.last_name = charSequence2;
                    updateprofile.flags |= 4;
                    String charSequence3 = this.f36278f.getText().toString();
                    userFull.about = charSequence3;
                    updateprofile.about = charSequence3;
                    if (TextUtils.isEmpty(charSequence3)) {
                        i9 = userFull.flags & (-3);
                    } else {
                        i9 = userFull.flags | 2;
                    }
                    userFull.flags = i9;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = userFull.birthday;
                if (!Z(this.D, this.F)) {
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
                long j11 = this.E;
                TLRPC.Chat chat = this.G;
                if (chat != null) {
                    j10 = chat.f22380id;
                } else {
                    j10 = 0;
                }
                if (j11 != j10) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.G);
                    TLRPC.Chat chat2 = this.G;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j12 = userFull.personal_channel_id;
                        long j13 = chat2.f22380id;
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
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLObject tLObject = (TLObject) arrayList.get(i11);
                    getConnectionsManager().sendRequest(tLObject, new bg.n0(this, tLObject, tL_birthday, userFull, iArr, arrayList, 4), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    public final void c0() {
        boolean z10;
        org.telegram.ui.Components.z41 z41Var;
        if (!this.K) {
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
            this.A = str;
            fg1Var.setText(str);
            fg1 fg1Var2 = this.f36277e;
            String str2 = user.last_name;
            this.B = str2;
            fg1Var2.setText(str2);
            fg1 fg1Var3 = this.f36278f;
            String str3 = userFull.about;
            this.C = str3;
            fg1Var3.setText(str3);
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
            boolean z11 = false;
            if (userFull.business_work_hours != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            if (userFull.business_location != null) {
                z11 = true;
            }
            this.I = z11;
            a0(true);
            org.telegram.ui.Components.c51 c51Var = this.f36283x;
            if (c51Var != null && (z41Var = c51Var.U2) != null) {
                z41Var.N(true);
            }
            this.K = true;
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
        org.telegram.ui.Cells.h3 h3Var = fg1Var2.f24544b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.u2(gVar, 2));
        fg1 fg1Var3 = new fg1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.f36277e = fg1Var3;
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(fg1Var3, 4);
        org.telegram.ui.Cells.h3 h3Var2 = fg1Var3.f24544b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.u2(gVar2, 2));
        fg1 fg1Var4 = new fg1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.f36278f = fg1Var4;
        fg1Var4.setShowLimitWhenEmpty(true);
        d0();
        this.f36279n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new dg1(this, 0));
        super.createView(context);
        org.telegram.ui.Components.c51 c51Var = this.f27658a;
        this.f36283x = c51Var;
        c51Var.p1();
        this.f36283x.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.f36283x);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 2));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = org.telegram.ui.ActionBar.f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.v = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        this.f36282w = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.v);
        a0(false);
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.Components.c51 c51Var;
        String str;
        int i9 = this.h;
        fg1 fg1Var = this.f36278f;
        if (fg1Var != null && !TextUtils.isEmpty(fg1Var.getText())) {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.f36279n = LocaleController.getString(R.string.Loading);
                this.h = Objects.hash(1);
            } else {
                int i10 = -1;
                char c10 = 65535;
                int i11 = 0;
                int i12 = 0;
                boolean z10 = false;
                for (int i13 = 0; i13 < privacyRules.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            TLRPC.Chat chat = getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i14));
                            if (chat != null) {
                                i12 = Math.max(0, chat.participants_count - 1) + i12;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size2 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            TLRPC.Chat chat2 = getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i15));
                            if (chat2 != null) {
                                i11 = Math.max(0, chat2.participants_count - 1) + i11;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        i12 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        i11 += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
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
                if (c10 != 0 && (c10 != 65535 || i11 <= 0)) {
                    if (c10 != 2 && (c10 != 65535 || i11 <= 0 || i12 <= 0)) {
                        if (c10 == 1 || (c10 == 65535 && i12 > 0)) {
                            i10 = 1;
                        }
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    if (i11 <= 0) {
                        this.f36279n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new dg1(this, 0)), true);
                    } else {
                        this.f36279n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(i11)), new dg1(this, 0)), true);
                    }
                } else if (i10 == 2) {
                    if (i11 <= 0 && i12 <= 0) {
                        this.f36279n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new dg1(this, 0)), true);
                    } else {
                        if (i12 > 0) {
                            str = j3.r0.l(i12, "+");
                        } else {
                            str = "";
                        }
                        if (i11 > 0) {
                            if (str.length() > 0) {
                                str = str.concat(", ");
                            }
                            str = str + "-" + i11;
                        }
                        this.f36279n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, str), new dg1(this, 0)), true);
                    }
                } else if (i10 == 0) {
                    if (i12 <= 0) {
                        this.f36279n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new dg1(this, 0)), true);
                    } else {
                        this.f36279n = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(i12)), new dg1(this, 0)), true);
                    }
                } else {
                    this.f36279n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new dg1(this, 0));
                }
                this.h = Objects.hash(Integer.valueOf(i10 + 10), Integer.valueOf(i12), Integer.valueOf(i11));
            }
        } else {
            this.f36279n = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.h = Objects.hash(0);
        }
        if (i9 != this.h && (c51Var = this.f36283x) != null) {
            c51Var.U2.N(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i9 == NotificationCenter.userInfoDidLoad) {
            c0();
        } else if (i9 == NotificationCenter.updateInterfaces) {
            org.telegram.ui.Components.c51 c51Var = this.f36283x;
            if (c51Var != null) {
                c51Var.U2.N(true);
            }
        } else if (i9 == NotificationCenter.privacyRulesUpdated) {
            d0();
            org.telegram.ui.Components.c51 c51Var2 = this.f36283x;
            if (c51Var2 != null) {
                c51Var2.U2.N(true);
            }
        } else if (i9 == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = pf.g.a(this.currentAccount).f45633c;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.f36281s = arrayList;
            org.telegram.ui.Components.c51 c51Var3 = this.f36283x;
            if (c51Var3 != null) {
                c51Var3.U2.N(true);
            }
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
        pf.g.a(this.currentAccount).c(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (!this.L) {
            b0(false);
        }
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f36283x.setPadding(0, 0, 0, i12);
        this.f36283x.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gg1 gg1Var = this.J;
        gg1Var.f38541c = false;
        gg1Var.f38543f.add(new dg1(this, 1));
        if (!gg1Var.f38541c && !gg1Var.d) {
            gg1Var.d = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = gg1Var.f38540b;
            ConnectionsManager.getInstance(gg1Var.f38539a).sendRequest(tL_channels_getAdminedPublicChannels, new m(gg1Var, 23));
        }
        this.f36280r = null;
        org.telegram.ui.Components.c51 c51Var = this.f36283x;
        if (c51Var != null) {
            c51Var.U2.N(true);
        }
    }
}
