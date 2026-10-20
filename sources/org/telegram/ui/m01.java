package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public class m01 extends org.telegram.ui.Components.im0 {
    public TLRPC.WebPage E;
    public boolean F;
    public l01[] f39075c;
    public final org.telegram.ui.ActionBar.n2 e;
    public final int f39076f;
    public final Context h;
    public boolean f39080w;
    public jv0 f39081x;
    public String f39082y;
    public final ArrayList d = new ArrayList();
    public ArrayList f39077n = new ArrayList();
    public ArrayList f39078r = new ArrayList();
    public ArrayList f39079s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public m01(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = n2Var;
        this.f39076f = n2Var.getCurrentAccount();
        this.h = context;
        this.f39075c = H(n2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked() && !UserConfig.getInstance(i10).isPremium()) {
            return false;
        }
        if (i11 != -1 && MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) == -1) {
            return false;
        }
        return true;
    }

    public static l01[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        l01 l01Var;
        l01 l01Var2;
        l01 l01Var3;
        l01 l01Var4;
        l01 l01Var5;
        l01 l01Var6;
        l01 l01Var7;
        l01 l01Var8;
        l01 l01Var9;
        l01 l01Var10;
        l01 l01Var11;
        l01 l01Var12;
        l01 l01Var13;
        l01 l01Var14;
        l01 l01Var15;
        l01 l01Var16;
        l01 l01Var17;
        l01 l01Var18;
        l01 l01Var19;
        l01 l01Var20;
        l01 l01Var21;
        l01 l01Var22;
        l01 l01Var23;
        final int currentAccount = n2Var.getCurrentAccount();
        l01 l01Var24 = new l01(LocaleController.getString(R.string.EditName), 500, 0, new jv0(18, n2Var, n2Var.getResourceProvider()));
        l01 l01Var25 = new l01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var25.a("tg://settings/edit/change-number");
        l01 l01Var26 = new l01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var26.a("tg://settings/edit/add-account");
        l01 l01Var27 = new l01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var27.a("tg://settings/notifications");
        l01 l01Var28 = new l01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var28.a("tg://settings/notifications/private-chats");
        l01 l01Var29 = new l01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01Var29.a("tg://settings/notifications/groups");
        l01 l01Var30 = new l01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new bi0(7, n2Var));
        l01Var30.a("tg://settings/notifications/channels");
        l01 l01Var31 = new l01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new bi0(19, n2Var));
        l01 l01Var32 = new l01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var33 = new l01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var34 = new l01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new bi0(23, n2Var));
        l01Var34.a("tg://settings/notifications/new-contacts");
        l01 l01Var35 = new l01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var35.a("tg://settings/notifications/pinned-messages");
        l01 l01Var36 = new l01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var36.a("tg://settings/notifications/reset");
        l01 l01Var37 = new l01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01 l01Var38 = new l01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01 l01Var39 = new l01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01 l01Var40 = new l01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var40.a("tg://settings/privacy");
        l01 l01Var41 = new l01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var41.a("tg://settings/privacy/2sv");
        l01 l01Var42 = new l01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new v4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ei.kb(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.f32624b.setText(spannableStringBuilder);
                            ybVar.f32624b.setSingleLine(false);
                            ybVar.f32624b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        l01Var42.a("tg://settings/privacy/auto-delete");
        l01 l01Var43 = new l01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var43.a("tg://settings/privacy/passcode");
        l01 l01Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            l01Var = l01Var41;
            l01Var2 = new l01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(360928);
                            qb0Var.V(64);
                            return;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(360928);
                            qb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(360928);
                            qb0Var3.V(256);
                            return;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(360928);
                            qb0Var4.V(32768);
                            return;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            return;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            return;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.f40529s;
                                if (i10 < arrayList.size()) {
                                    if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                        qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
                            return;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            l01Var2.a("tg://settings/privacy/login-email");
        } else {
            l01Var = l01Var41;
            l01Var2 = null;
        }
        l01 l01Var45 = new l01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var45.a("tg://settings/privacy/blocked");
        l01 l01Var46 = new l01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var46.a("tg://settings/devices");
        l01 l01Var47 = new l01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var47.a("tg://settings/privacy/phone-number/");
        l01 l01Var48 = new l01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var48.a("tg://settings/privacy/last-seen");
        l01 l01Var49 = new l01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var49.a("tg://settings/privacy/profile-photos");
        l01 l01Var50 = new l01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var50.a("tg://settings/privacy/forwards");
        l01 l01Var51 = new l01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var51.a("tg://settings/privacy/calls/p2p");
        l01 l01Var52 = new l01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var52.a("tg://settings/privacy/calls");
        l01 l01Var53 = new l01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var53.a("tg://settings/privacy/invites");
        l01 l01Var54 = new l01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new v4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ei.kb(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.f32624b.setText(spannableStringBuilder);
                            ybVar.f32624b.setSingleLine(false);
                            ybVar.f32624b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        l01Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            l01Var3 = l01Var54;
            l01Var4 = new l01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (UserConfig.getInstance(i10).isClientActivated()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                n2Var.presentFragment(new dg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new c7());
                            return;
                        case 24:
                            n2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new c7());
                            return;
                        case 27:
                            n2Var.presentFragment(new c7());
                            return;
                        case 28:
                            n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                            return;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            l01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            l01Var3 = l01Var54;
            l01Var4 = null;
        }
        l01 l01Var55 = new l01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var55.a("tg://settings/privacy/self-destruct");
        l01 l01Var56 = new l01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        l01 l01Var57 = new l01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var57.a("tg://settings/privacy/active-websites");
        l01 l01Var58 = new l01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var58.a("tg://settings/privacy/data-settings/delete-synced");
        l01 l01Var59 = new l01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        l01 l01Var60 = new l01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        l01 l01Var61 = new l01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var61.a("tg://settings/privacy/data-settings/map-provider");
        l01 l01Var62 = new l01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var62.a("tg://settings/privacy/data-settings/link-previews");
        l01 l01Var63 = new l01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var63.a("tg://settings/devices");
        l01 l01Var64 = new l01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var64.a("tg://settings/devices/terminate-sessions");
        l01 l01Var65 = new l01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var65.a("tg://settings/devices/link-desktop");
        l01 l01Var66 = new l01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var66.a("tg://settings/privacy/data-settings");
        l01 l01Var67 = new l01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01 l01Var68 = new l01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var68.a("tg://settings/data/storage");
        l01 l01Var69 = new l01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01 l01Var70 = new l01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01 l01Var71 = new l01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01 l01Var72 = new l01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            n2Var.presentFragment(new dg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
                        return;
                    case 28:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        l01Var72.a("tg://settings/data/usage");
        l01 l01Var73 = new l01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var74 = new l01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var75 = new l01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var76 = new l01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var77 = new l01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01Var77.a("tg://settings/data/auto-download/reset");
        l01 l01Var78 = new l01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var79 = new l01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var80 = new l01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var81 = new l01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01Var81.a("tg://settings/data/use-less-data");
        l01 l01Var82 = new l01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var83 = new l01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01Var83.a("tg://settings/data/proxy");
        l01 l01Var84 = new l01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        l01 l01Var85 = new l01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01 l01Var86 = new l01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01Var86.a("tg://settings/data/save-to-photos/chats");
        l01 l01Var87 = new l01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        l01Var87.a("tg://settings/data/save-to-photos/groups");
        l01 l01Var88 = new l01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new bi0(2, n2Var));
        l01Var88.a("tg://settings/data/save-to-photos/channels");
        l01 l01Var89 = new l01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new bi0(3, n2Var));
        l01Var89.a("tg://settings/appearance/themes");
        l01 l01Var90 = new l01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(4, n2Var));
        l01Var90.a("tg://settings/appearance/text-size");
        l01 l01Var91 = new l01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(5, n2Var));
        l01Var91.a("tg://settings/appearance/wallpapers");
        l01 l01Var92 = new l01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new bi0(6, n2Var));
        l01 l01Var93 = new l01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new bi0(8, n2Var));
        l01 l01Var94 = new l01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(9, n2Var));
        l01 l01Var95 = new l01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(10, n2Var));
        l01 l01Var96 = new l01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new bi0(11, n2Var));
        l01Var96.a("tg://settings/appearance/themes/create");
        l01 l01Var97 = new l01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(13, n2Var));
        l01Var97.a("tg://settings/appearance/message-corners");
        l01 l01Var98 = new l01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(14, n2Var));
        l01 l01Var99 = new l01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(15, n2Var));
        l01 l01Var100 = new l01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(16, n2Var));
        l01Var100.a("tg://settings/appearance/app-icon");
        l01 l01Var101 = new l01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(17, n2Var));
        l01 l01Var102 = new l01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(18, n2Var));
        l01Var102.a("tg://settings/appearance/tap-for-next-media");
        l01 l01Var103 = new l01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(20, n2Var));
        l01Var103.a("tg://settings/data/raise-to-listen");
        l01 l01Var104 = new l01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(21, n2Var));
        l01Var104.a("tg://settings/data/raise-to-speak");
        l01 l01Var105 = new l01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(22, n2Var));
        l01Var105.a("tg://settings/data/pause-music");
        l01 l01Var106 = new l01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(24, n2Var));
        l01 l01Var107 = new l01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(25, n2Var));
        l01 l01Var108 = new l01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(26, n2Var));
        l01 l01Var109 = new l01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(27, n2Var));
        l01 l01Var110 = new l01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new bi0(28, n2Var));
        l01Var110.a("tg://settings/appearance/stickers-and-emoji");
        l01 l01Var111 = new l01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new bi0(29, n2Var));
        l01 l01Var112 = new l01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var113 = new l01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var114 = new l01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        l01 l01Var115 = new l01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var116 = new l01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        l01 l01Var117 = new l01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var118 = new l01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        l01 l01Var119 = new l01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        l01 l01Var120 = new l01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var121 = new l01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        l01 l01Var122 = new l01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var122.a("tg://settings/folders");
        l01 l01Var123 = new l01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            l01Var5 = l01Var123;
            l01Var6 = l01Var114;
            l01Var7 = l01Var116;
            l01Var8 = l01Var118;
            l01Var9 = new l01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(360928);
                            qb0Var.V(64);
                            return;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(360928);
                            qb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(360928);
                            qb0Var3.V(256);
                            return;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(360928);
                            qb0Var4.V(32768);
                            return;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            return;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            return;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.f40529s;
                                if (i10 < arrayList.size()) {
                                    if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                        qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
                            return;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            l01Var5 = l01Var123;
            l01Var6 = l01Var114;
            l01Var7 = l01Var116;
            l01Var8 = l01Var118;
            l01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            l01Var10 = new l01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(360928);
                            qb0Var.V(64);
                            return;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(360928);
                            qb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(360928);
                            qb0Var3.V(256);
                            return;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(360928);
                            qb0Var4.V(32768);
                            return;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            return;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            return;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.f40529s;
                                if (i10 < arrayList.size()) {
                                    if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                        qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
                            return;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            l01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            l01Var11 = new l01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(360928);
                            qb0Var.V(64);
                            return;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(360928);
                            qb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(360928);
                            qb0Var3.V(256);
                            return;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(360928);
                            qb0Var4.V(32768);
                            return;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            return;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            return;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.f40529s;
                                if (i10 < arrayList.size()) {
                                    if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                        qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
                            return;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            l01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            l01Var12 = new l01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (UserConfig.getInstance(i10).isClientActivated()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                n2Var.presentFragment(new dg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new c7());
                            return;
                        case 24:
                            n2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new c7());
                            return;
                        case 27:
                            n2Var.presentFragment(new c7());
                            return;
                        case 28:
                            n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                            return;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            l01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            l01Var13 = new l01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (UserConfig.getInstance(i10).isClientActivated()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                n2Var.presentFragment(new dg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new c7());
                            return;
                        case 24:
                            n2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new c7());
                            return;
                        case 27:
                            n2Var.presentFragment(new c7());
                            return;
                        case 28:
                            n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                            return;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            l01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            l01Var14 = new l01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (UserConfig.getInstance(i10).isClientActivated()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                n2Var.presentFragment(new dg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new c7());
                            return;
                        case 24:
                            n2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new c7());
                            return;
                        case 27:
                            n2Var.presentFragment(new c7());
                            return;
                        case 28:
                            n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                            return;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            l01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            l01Var15 = new l01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            n2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            l01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            l01Var16 = new l01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            n2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            l01Var16 = null;
        }
        if (F(currentAccount, 5)) {
            l01Var17 = new l01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new bi0(12, n2Var));
        } else {
            l01Var17 = null;
        }
        if (F(currentAccount, 9)) {
            l01Var18 = new l01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new z11());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            return;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            return;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            return;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(28700);
                            qb0Var5.V(16388);
                            return;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(28700);
                            qb0Var6.V(8200);
                            return;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(28700);
                            qb0Var7.V(4112);
                            return;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(360928);
                            return;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(360928);
                            qb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            l01Var18 = null;
        }
        if (F(currentAccount, 6)) {
            l01Var19 = new l01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new z11());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            return;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            return;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            return;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(28700);
                            qb0Var5.V(16388);
                            return;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(28700);
                            qb0Var6.V(8200);
                            return;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(28700);
                            qb0Var7.V(4112);
                            return;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(360928);
                            return;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(360928);
                            qb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            l01Var19 = null;
        }
        if (F(currentAccount, 7)) {
            l01Var20 = new l01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new z11());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            return;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            return;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            return;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(28700);
                            qb0Var5.V(16388);
                            return;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(28700);
                            qb0Var6.V(8200);
                            return;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(28700);
                            qb0Var7.V(4112);
                            return;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(360928);
                            return;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(360928);
                            qb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            l01Var20 = null;
        }
        if (F(currentAccount, 10)) {
            l01Var21 = new l01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new z11());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            return;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            return;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            return;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(28700);
                            qb0Var5.V(16388);
                            return;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(28700);
                            qb0Var6.V(8200);
                            return;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(28700);
                            qb0Var7.V(4112);
                            return;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(360928);
                            return;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(360928);
                            qb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            l01Var21 = null;
        }
        if (F(currentAccount, 12)) {
            l01Var22 = new l01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new z11());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            return;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            return;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            return;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(28700);
                            qb0Var5.V(16388);
                            return;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(28700);
                            qb0Var6.V(8200);
                            return;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(28700);
                            qb0Var7.V(4112);
                            return;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(360928);
                            return;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(360928);
                            qb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            l01Var22 = null;
        }
        l01 l01Var124 = new l01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var124.a("tg://settings/power-saving");
        l01 l01Var125 = new l01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var125.a("tg://settings/power-saving/stickers");
        l01 l01Var126 = new l01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var127 = new l01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var128 = new l01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var128.a("tg://settings/power-saving/emoji");
        l01 l01Var129 = new l01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var130 = new l01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var131 = new l01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01 l01Var132 = new l01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var132.a("tg://settings/power-saving/effects");
        l01 l01Var133 = new l01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new z11());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        return;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        return;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        return;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(28700);
                        qb0Var5.V(16388);
                        return;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(28700);
                        qb0Var6.V(8200);
                        return;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(28700);
                        qb0Var7.V(4112);
                        return;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(360928);
                        return;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(360928);
                        qb0Var9.V(32);
                        return;
                }
            }
        });
        l01Var133.a("tg://settings/power-saving/background");
        l01 l01Var134 = new l01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01 l01Var135 = new l01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            l01Var23 = new l01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(360928);
                            qb0Var.V(64);
                            return;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(360928);
                            qb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(360928);
                            qb0Var3.V(256);
                            return;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(360928);
                            qb0Var4.V(32768);
                            return;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            return;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            return;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.f40529s;
                                if (i10 < arrayList.size()) {
                                    if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                        qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
                            return;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            l01Var23 = null;
        }
        l01 l01Var136 = new l01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01 l01Var137 = new l01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var137.a("tg://settings/power-saving/call-animations");
        l01 l01Var138 = new l01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var138.a("tg://settings/power-saving/videos");
        l01 l01Var139 = new l01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var139.a("tg://settings/power-saving/gifs");
        l01 l01Var140 = new l01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var140.a("tg://settings/power-saving/transitions");
        l01 l01Var141 = new l01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var141.a("tg://settings/language");
        l01 l01Var142 = new l01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            l01 l01Var143 = new l01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(360928);
                            qb0Var.V(64);
                            return;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(360928);
                            qb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(360928);
                            qb0Var3.V(256);
                            return;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(360928);
                            qb0Var4.V(32768);
                            return;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            return;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            return;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.f40529s;
                                if (i10 < arrayList.size()) {
                                    if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                        qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
                            return;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            l01Var143.a("tg://settings/language/do-not-translate");
            l01Var44 = l01Var143;
        }
        l01 l01Var144 = new l01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var144.a("tg://settings/ask-question");
        l01 l01Var145 = new l01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var145.a("tg://settings/faq");
        l01 l01Var146 = new l01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(360928);
                        qb0Var.V(64);
                        return;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(360928);
                        qb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(360928);
                        qb0Var3.V(256);
                        return;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(360928);
                        qb0Var4.V(32768);
                        return;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        return;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        return;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.f40529s;
                            if (i10 < arrayList.size()) {
                                if (((kb0) arrayList.get(i10)).f38504f == 1) {
                                    qb0Var8.f40524b.e1(new i2.s(qb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
                        return;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        l01Var146.a("tg://settings/privacy-policy");
        return new l01[]{l01Var24, l01Var25, l01Var26, l01Var27, l01Var28, l01Var29, l01Var30, l01Var31, l01Var32, l01Var33, l01Var34, l01Var35, l01Var36, l01Var37, l01Var38, l01Var39, l01Var40, l01Var, l01Var42, l01Var43, l01Var2, l01Var45, l01Var46, l01Var47, l01Var48, l01Var49, l01Var50, l01Var51, l01Var52, l01Var53, l01Var3, l01Var4, l01Var55, l01Var56, l01Var57, l01Var58, l01Var59, l01Var60, l01Var61, l01Var62, l01Var63, l01Var64, l01Var65, l01Var66, l01Var67, l01Var68, l01Var69, l01Var70, l01Var71, l01Var72, l01Var73, l01Var74, l01Var75, l01Var76, l01Var77, l01Var78, l01Var79, l01Var80, l01Var81, l01Var82, l01Var83, l01Var84, l01Var85, l01Var86, l01Var87, l01Var88, l01Var89, l01Var90, l01Var91, l01Var92, l01Var93, l01Var94, l01Var95, l01Var96, l01Var97, l01Var98, l01Var99, l01Var100, l01Var101, l01Var102, l01Var103, l01Var104, l01Var105, l01Var106, l01Var107, l01Var108, l01Var109, l01Var110, l01Var111, l01Var112, l01Var113, l01Var6, l01Var115, l01Var7, l01Var117, l01Var8, l01Var119, l01Var120, l01Var121, l01Var122, l01Var5, l01Var9, l01Var10, l01Var11, l01Var12, l01Var13, l01Var14, l01Var15, l01Var16, l01Var17, l01Var18, l01Var19, l01Var20, l01Var21, l01Var22, l01Var124, l01Var125, l01Var126, l01Var127, l01Var128, l01Var129, l01Var130, l01Var131, l01Var132, l01Var133, l01Var134, l01Var135, l01Var23, l01Var136, l01Var137, l01Var138, l01Var139, l01Var140, l01Var141, l01Var142, l01Var44, l01Var144, l01Var145, l01Var146};
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45920f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f39080w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof l01) {
                ((l01) obj2).f38716g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f39076f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i10).faqWebPage;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i10).faqSearchArray);
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new m(this, 20));
        }
    }

    public final void I(String str) {
        this.f39082y = str;
        if (this.f39081x != null) {
            Utilities.searchQueue.cancelRunnable(this.f39081x);
            this.f39081x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f39080w = false;
            this.f39078r.clear();
            this.f39079s.clear();
            this.f39077n.clear();
            org.telegram.ui.ActionBar.n2 n2Var = this.e;
            if (n2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) n2Var).P.f30696b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        jv0 jv0Var = new jv0(19, this, str);
        this.f39081x = jv0Var;
        dispatchQueue.postRunnable(jv0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        l01 l01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            l01[] l01VarArr = this.f39075c;
            if (i10 >= l01VarArr.length) {
                break;
            }
            l01 l01Var2 = l01VarArr[i10];
            if (l01Var2 != null) {
                hashMap.put(Integer.valueOf(l01Var2.f38715f), this.f39075c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.v;
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
                    int readInt32 = serializedData.readInt32(false);
                    int readInt322 = serializedData.readInt32(false);
                    if (readInt322 == 0) {
                        String readString = serializedData.readString(false);
                        int readInt323 = serializedData.readInt32(false);
                        if (readInt323 > 0) {
                            strArr = new String[readInt323];
                            for (int i11 = 0; i11 < readInt323; i11++) {
                                strArr[i11] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(readString, strArr, serializedData.readString(false));
                        faqSearchResult.num = readInt32;
                        arrayList.add(faqSearchResult);
                    } else if (readInt322 == 1 && (l01Var = (l01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        l01Var.f38716g = readInt32;
                        arrayList.add(l01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new jg0(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f39080w) {
            int size2 = this.f39078r.size();
            if (!this.f39079s.isEmpty()) {
                i10 = this.f39079s.size() + 1;
            }
            return size2 + i10;
        }
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            size = 0;
        } else {
            size = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.d;
        if (!arrayList2.isEmpty()) {
            i10 = arrayList2.size() + 1;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (this.f39080w) {
            if (i10 < this.f39078r.size() || i10 != this.f39078r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.v;
            if (i10 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i10 != arrayList.size() + 1) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        l01 l01Var;
        int i11;
        int i12 = b1Var.f45920f;
        View view = b1Var.f45917a;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
            return;
        }
        org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
        boolean z11 = false;
        if (this.f39080w) {
            if (i10 < this.f39078r.size()) {
                l01 l01Var2 = (l01) this.f39078r.get(i10);
                if (i10 > 0) {
                    l01Var = (l01) this.f39078r.get(i10 - 1);
                } else {
                    l01Var = null;
                }
                if (l01Var != null && l01Var.e == l01Var2.e) {
                    i11 = 0;
                } else {
                    i11 = l01Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f39077n.get(i10);
                String[] strArr = l01Var2.d;
                if (i10 >= this.f39078r.size() - 1) {
                    z10 = false;
                }
                w6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.f39078r);
            CharSequence charSequence2 = (CharSequence) this.f39077n.get(this.f39078r.size() + g10);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f39079s.get(g10)).path;
            if (g10 < this.f39078r.size() - 1) {
                z11 = true;
            }
            w6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof l01) {
                l01 l01Var3 = (l01) obj;
                String str = l01Var3.f38712a;
                String[] strArr3 = l01Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                w6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i10 < arrayList.size() - 1) {
                    z11 = true;
                }
                w6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int g11 = com.google.android.gms.internal.play_billing.k3.g(1, i10, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(g11);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (g11 < arrayList.size() - 1) {
            z11 = true;
        }
        w6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                w6Var = new org.telegram.ui.Cells.l4(context, 16);
            } else {
                w6Var = new org.telegram.ui.Cells.u3(context, null);
            }
        } else {
            w6Var = new org.telegram.ui.Cells.w6(context);
        }
        w6Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(w6Var);
    }
}
