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
public class g01 extends org.telegram.ui.Components.il0 {
    public TLRPC.WebPage A;
    public boolean B;
    public f01[] f38410c;
    public final org.telegram.ui.ActionBar.o2 f38411e;
    public final int f38412f;
    public final Context h;
    public boolean f38416w;
    public av0 f38417x;
    public String f38418y;
    public final ArrayList d = new ArrayList();
    public ArrayList f38413n = new ArrayList();
    public ArrayList f38414r = new ArrayList();
    public ArrayList f38415s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public g01(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f38411e = o2Var;
        this.f38412f = o2Var.getCurrentAccount();
        this.h = context;
        this.f38410c = H(o2Var);
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

    public static f01[] H(final org.telegram.ui.ActionBar.o2 o2Var) {
        f01 f01Var;
        f01 f01Var2;
        f01 f01Var3;
        f01 f01Var4;
        f01 f01Var5;
        f01 f01Var6;
        f01 f01Var7;
        f01 f01Var8;
        f01 f01Var9;
        f01 f01Var10;
        f01 f01Var11;
        f01 f01Var12;
        f01 f01Var13;
        f01 f01Var14;
        f01 f01Var15;
        f01 f01Var16;
        f01 f01Var17;
        f01 f01Var18;
        f01 f01Var19;
        f01 f01Var20;
        f01 f01Var21;
        f01 f01Var22;
        final int currentAccount = o2Var.getCurrentAccount();
        f01 f01Var23 = new f01(LocaleController.getString(R.string.EditName), 500, 0, new av0(19, o2Var, o2Var.getResourceProvider()));
        f01 f01Var24 = new f01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var24.a("tg://settings/edit/change-number");
        f01 f01Var25 = new f01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var25.a("tg://settings/edit/add-account");
        f01 f01Var26 = new f01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var26.a("tg://settings/notifications");
        f01 f01Var27 = new f01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01Var27.a("tg://settings/notifications/private-chats");
        f01 f01Var28 = new f01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01Var28.a("tg://settings/notifications/groups");
        f01 f01Var29 = new f01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new zh0(8, o2Var));
        f01Var29.a("tg://settings/notifications/channels");
        f01 f01Var30 = new f01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new zh0(20, o2Var));
        f01 f01Var31 = new f01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var32 = new f01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var33 = new f01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new zh0(23, o2Var));
        f01Var33.a("tg://settings/notifications/new-contacts");
        f01 f01Var34 = new f01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var34.a("tg://settings/notifications/pinned-messages");
        f01 f01Var35 = new f01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var35.a("tg://settings/notifications/reset");
        f01 f01Var36 = new f01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01 f01Var37 = new f01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01 f01Var38 = new f01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01 f01Var39 = new f01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var39.a("tg://settings/privacy");
        f01 f01Var40 = new f01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var40.a("tg://settings/privacy/2sv");
        f01 f01Var41 = new f01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new q4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(a02.W(), null);
                            ubVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new cg.l0(a02, 6), indexOf, lastIndexOf - 1, 33);
                            }
                            ubVar.f33185b.setText(spannableStringBuilder);
                            ubVar.f33185b.setSingleLine(false);
                            ubVar.f33185b.setMaxLines(2);
                            a02.b(ubVar, 2750).j();
                            return;
                        }
                        o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        f01Var41.a("tg://settings/privacy/auto-delete");
        f01 f01Var42 = new f01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var42.a("tg://settings/privacy/passcode");
        f01 f01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            f01Var = f01Var40;
            f01Var2 = new f01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(360928);
                            return;
                        case 1:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(360928);
                            ub0Var2.V(32);
                            return;
                        case 2:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(360928);
                            ub0Var3.V(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.W(360928);
                            ub0Var4.V(128);
                            return;
                        case 5:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(360928);
                            ub0Var5.V(256);
                            return;
                        case 6:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(360928);
                            ub0Var6.V(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.V(512);
                            return;
                        case 9:
                            ub0 ub0Var8 = new ub0();
                            o2Var.presentFragment(ub0Var8);
                            ub0Var8.V(1024);
                            return;
                        case 10:
                            ub0 ub0Var9 = new ub0();
                            o2Var.presentFragment(ub0Var9);
                            ub0Var9.V(2048);
                            return;
                        case 11:
                            ub0 ub0Var10 = new ub0();
                            o2Var.presentFragment(ub0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ub0Var10.f43221s;
                                if (i10 < arrayList.size()) {
                                    if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                        ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                            return;
                        case 17:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                            p1Var.C();
                            o2Var3.showDialog(p1Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            o2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            bx0 bx0Var = new bx0();
                            bx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(bx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            f01Var2.a("tg://settings/privacy/login-email");
        } else {
            f01Var = f01Var40;
            f01Var2 = null;
        }
        f01 f01Var44 = new f01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var44.a("tg://settings/privacy/blocked");
        f01 f01Var45 = new f01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var45.a("tg://settings/devices");
        f01 f01Var46 = new f01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var46.a("tg://settings/privacy/phone-number/");
        f01 f01Var47 = new f01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var47.a("tg://settings/privacy/last-seen");
        f01 f01Var48 = new f01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var48.a("tg://settings/privacy/profile-photos");
        f01 f01Var49 = new f01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var49.a("tg://settings/privacy/forwards");
        f01 f01Var50 = new f01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var50.a("tg://settings/privacy/calls/p2p");
        f01 f01Var51 = new f01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var51.a("tg://settings/privacy/calls");
        f01 f01Var52 = new f01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var52.a("tg://settings/privacy/invites");
        f01 f01Var53 = new f01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new q4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(a02.W(), null);
                            ubVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new cg.l0(a02, 6), indexOf, lastIndexOf - 1, 33);
                            }
                            ubVar.f33185b.setText(spannableStringBuilder);
                            ubVar.f33185b.setSingleLine(false);
                            ubVar.f33185b.setMaxLines(2);
                            a02.b(ubVar, 2750).j();
                            return;
                        }
                        o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        f01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            f01Var3 = new f01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
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
                                o2Var.presentFragment(new fg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            o2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            o2Var.presentFragment(new x6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 27:
                            o2Var.presentFragment(new x6());
                            return;
                        case 28:
                            o2Var.presentFragment(new x6());
                            return;
                        default:
                            o2Var.presentFragment(new x6());
                            return;
                    }
                }
            });
            f01Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            f01Var3 = null;
        }
        f01 f01Var54 = new f01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var54.a("tg://settings/privacy/self-destruct");
        f01 f01Var55 = new f01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        f01 f01Var56 = new f01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var56.a("tg://settings/privacy/active-websites");
        f01 f01Var57 = new f01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        f01 f01Var58 = new f01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        f01 f01Var59 = new f01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        f01 f01Var60 = new f01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var60.a("tg://settings/privacy/data-settings/map-provider");
        f01 f01Var61 = new f01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var61.a("tg://settings/privacy/data-settings/link-previews");
        f01 f01Var62 = new f01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var62.a("tg://settings/devices");
        f01 f01Var63 = new f01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var63.a("tg://settings/devices/terminate-sessions");
        f01 f01Var64 = new f01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var64.a("tg://settings/devices/link-desktop");
        f01 f01Var65 = new f01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var65.a("tg://settings/privacy/data-settings");
        f01 f01Var66 = new f01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01 f01Var67 = new f01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01Var67.a("tg://settings/data/storage");
        f01 f01Var68 = new f01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01 f01Var69 = new f01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01 f01Var70 = new f01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
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
                            o2Var.presentFragment(new fg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        o2Var.presentFragment(new x6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new x6());
                        return;
                    case 28:
                        o2Var.presentFragment(new x6());
                        return;
                    default:
                        o2Var.presentFragment(new x6());
                        return;
                }
            }
        });
        f01 f01Var71 = new f01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01Var71.a("tg://settings/data/usage");
        f01 f01Var72 = new f01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var73 = new f01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var74 = new f01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var75 = new f01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var76 = new f01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01Var76.a("tg://settings/data/auto-download/reset");
        f01 f01Var77 = new f01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var78 = new f01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var79 = new f01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var80 = new f01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01Var80.a("tg://settings/data/use-less-data");
        f01 f01Var81 = new f01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var82 = new f01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01Var82.a("tg://settings/data/proxy");
        f01 f01Var83 = new f01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01Var83.a("tg://settings/data/proxy/use-for-calls");
        f01 f01Var84 = new f01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        f01 f01Var85 = new f01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                }
            }
        });
        f01 f01Var86 = new f01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new zh0(2, o2Var));
        f01Var86.a("tg://settings/data/save-to-photos/chats");
        f01 f01Var87 = new f01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new zh0(3, o2Var));
        f01Var87.a("tg://settings/data/save-to-photos/groups");
        f01 f01Var88 = new f01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new zh0(4, o2Var));
        f01Var88.a("tg://settings/data/save-to-photos/channels");
        f01 f01Var89 = new f01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new zh0(5, o2Var));
        f01Var89.a("tg://settings/appearance/themes");
        f01 f01Var90 = new f01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(6, o2Var));
        f01Var90.a("tg://settings/appearance/text-size");
        f01 f01Var91 = new f01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(7, o2Var));
        f01Var91.a("tg://settings/appearance/wallpapers");
        f01 f01Var92 = new f01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new zh0(9, o2Var));
        f01 f01Var93 = new f01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new zh0(10, o2Var));
        f01 f01Var94 = new f01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(11, o2Var));
        f01 f01Var95 = new f01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(13, o2Var));
        f01 f01Var96 = new f01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new zh0(14, o2Var));
        f01Var96.a("tg://settings/appearance/themes/create");
        f01 f01Var97 = new f01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(15, o2Var));
        f01Var97.a("tg://settings/appearance/message-corners");
        f01 f01Var98 = new f01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(16, o2Var));
        f01 f01Var99 = new f01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(17, o2Var));
        f01 f01Var100 = new f01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(18, o2Var));
        f01Var100.a("tg://settings/appearance/app-icon");
        f01 f01Var101 = new f01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(19, o2Var));
        f01 f01Var102 = new f01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(21, o2Var));
        f01Var102.a("tg://settings/appearance/tap-for-next-media");
        f01 f01Var103 = new f01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(22, o2Var));
        f01Var103.a("tg://settings/data/raise-to-listen");
        f01 f01Var104 = new f01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(24, o2Var));
        f01Var104.a("tg://settings/data/raise-to-speak");
        f01 f01Var105 = new f01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(25, o2Var));
        f01Var105.a("tg://settings/data/pause-music");
        f01 f01Var106 = new f01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(26, o2Var));
        f01 f01Var107 = new f01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(27, o2Var));
        f01 f01Var108 = new f01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(28, o2Var));
        f01 f01Var109 = new f01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new zh0(29, o2Var));
        f01 f01Var110 = new f01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var110.a("tg://settings/appearance/stickers-and-emoji");
        f01 f01Var111 = new f01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var112 = new f01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var113 = new f01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var114 = new f01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        f01 f01Var115 = new f01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var116 = new f01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        f01 f01Var117 = new f01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var118 = new f01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        f01 f01Var119 = new f01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        f01 f01Var120 = new f01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var121 = new f01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        f01 f01Var122 = new f01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var122.a("tg://settings/folders");
        f01 f01Var123 = new f01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            f01Var4 = f01Var123;
            f01Var5 = f01Var114;
            f01Var6 = f01Var116;
            f01Var7 = f01Var118;
            f01Var8 = new f01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(360928);
                            return;
                        case 1:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(360928);
                            ub0Var2.V(32);
                            return;
                        case 2:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(360928);
                            ub0Var3.V(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.W(360928);
                            ub0Var4.V(128);
                            return;
                        case 5:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(360928);
                            ub0Var5.V(256);
                            return;
                        case 6:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(360928);
                            ub0Var6.V(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.V(512);
                            return;
                        case 9:
                            ub0 ub0Var8 = new ub0();
                            o2Var.presentFragment(ub0Var8);
                            ub0Var8.V(1024);
                            return;
                        case 10:
                            ub0 ub0Var9 = new ub0();
                            o2Var.presentFragment(ub0Var9);
                            ub0Var9.V(2048);
                            return;
                        case 11:
                            ub0 ub0Var10 = new ub0();
                            o2Var.presentFragment(ub0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ub0Var10.f43221s;
                                if (i10 < arrayList.size()) {
                                    if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                        ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                            return;
                        case 17:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                            p1Var.C();
                            o2Var3.showDialog(p1Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            o2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            bx0 bx0Var = new bx0();
                            bx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(bx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            f01Var4 = f01Var123;
            f01Var5 = f01Var114;
            f01Var6 = f01Var116;
            f01Var7 = f01Var118;
            f01Var8 = null;
        }
        if (F(currentAccount, 0)) {
            f01Var9 = new f01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(360928);
                            return;
                        case 1:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(360928);
                            ub0Var2.V(32);
                            return;
                        case 2:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(360928);
                            ub0Var3.V(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.W(360928);
                            ub0Var4.V(128);
                            return;
                        case 5:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(360928);
                            ub0Var5.V(256);
                            return;
                        case 6:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(360928);
                            ub0Var6.V(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.V(512);
                            return;
                        case 9:
                            ub0 ub0Var8 = new ub0();
                            o2Var.presentFragment(ub0Var8);
                            ub0Var8.V(1024);
                            return;
                        case 10:
                            ub0 ub0Var9 = new ub0();
                            o2Var.presentFragment(ub0Var9);
                            ub0Var9.V(2048);
                            return;
                        case 11:
                            ub0 ub0Var10 = new ub0();
                            o2Var.presentFragment(ub0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ub0Var10.f43221s;
                                if (i10 < arrayList.size()) {
                                    if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                        ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                            return;
                        case 17:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                            p1Var.C();
                            o2Var3.showDialog(p1Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            o2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            bx0 bx0Var = new bx0();
                            bx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(bx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            f01Var9 = null;
        }
        if (F(currentAccount, 11)) {
            f01Var10 = new f01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
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
                                o2Var.presentFragment(new fg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            o2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            o2Var.presentFragment(new x6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 27:
                            o2Var.presentFragment(new x6());
                            return;
                        case 28:
                            o2Var.presentFragment(new x6());
                            return;
                        default:
                            o2Var.presentFragment(new x6());
                            return;
                    }
                }
            });
        } else {
            f01Var10 = null;
        }
        if (F(currentAccount, 1)) {
            f01Var11 = new f01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
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
                                o2Var.presentFragment(new fg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            o2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            o2Var.presentFragment(new x6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 27:
                            o2Var.presentFragment(new x6());
                            return;
                        case 28:
                            o2Var.presentFragment(new x6());
                            return;
                        default:
                            o2Var.presentFragment(new x6());
                            return;
                    }
                }
            });
        } else {
            f01Var11 = null;
        }
        if (F(currentAccount, 2)) {
            f01Var12 = new f01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 11, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
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
                                o2Var.presentFragment(new fg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 1, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            o2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            o2Var.presentFragment(new x6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 2, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 27:
                            o2Var.presentFragment(new x6());
                            return;
                        case 28:
                            o2Var.presentFragment(new x6());
                            return;
                        default:
                            o2Var.presentFragment(new x6());
                            return;
                    }
                }
            });
        } else {
            f01Var12 = null;
        }
        if (F(currentAccount, 8)) {
            f01Var13 = new f01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                            return;
                        case 1:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 3:
                            o2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 4:
                            o2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 5:
                            o2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 6:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 7:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 8:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 14:
                            o2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 15:
                            o2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 16:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                    }
                }
            });
        } else {
            f01Var13 = null;
        }
        if (F(currentAccount, 3)) {
            f01Var14 = new f01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                            return;
                        case 1:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 3:
                            o2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 4:
                            o2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 5:
                            o2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 6:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 7:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 8, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 8:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 14:
                            o2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 15:
                            o2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 16:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 3, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                    }
                }
            });
        } else {
            f01Var14 = null;
        }
        if (F(currentAccount, 4)) {
            f01Var15 = new f01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new zh0(12, o2Var));
        } else {
            f01Var15 = null;
        }
        if (F(currentAccount, 5)) {
            f01Var16 = new f01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            o2Var.presentFragment(new i21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                            p1Var4.C();
                            o2Var5.showDialog(p1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                            p1Var5.C();
                            o2Var6.showDialog(p1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                            p1Var6.C();
                            o2Var7.showDialog(p1Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new ub0());
                            return;
                        case 21:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(3);
                            ub0Var2.V(1);
                            return;
                        case 24:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(3);
                            ub0Var3.V(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.V(28700);
                            return;
                        case 27:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(28700);
                            ub0Var5.V(16388);
                            return;
                        case 28:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(28700);
                            ub0Var6.V(8200);
                            return;
                        default:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.W(28700);
                            ub0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            f01Var16 = null;
        }
        if (F(currentAccount, 9)) {
            f01Var17 = new f01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            o2Var.presentFragment(new i21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                            p1Var4.C();
                            o2Var5.showDialog(p1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                            p1Var5.C();
                            o2Var6.showDialog(p1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                            p1Var6.C();
                            o2Var7.showDialog(p1Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new ub0());
                            return;
                        case 21:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(3);
                            ub0Var2.V(1);
                            return;
                        case 24:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(3);
                            ub0Var3.V(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.V(28700);
                            return;
                        case 27:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(28700);
                            ub0Var5.V(16388);
                            return;
                        case 28:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(28700);
                            ub0Var6.V(8200);
                            return;
                        default:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.W(28700);
                            ub0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            f01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            f01Var18 = new f01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            o2Var.presentFragment(new i21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                            p1Var4.C();
                            o2Var5.showDialog(p1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                            p1Var5.C();
                            o2Var6.showDialog(p1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                            p1Var6.C();
                            o2Var7.showDialog(p1Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new ub0());
                            return;
                        case 21:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(3);
                            ub0Var2.V(1);
                            return;
                        case 24:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(3);
                            ub0Var3.V(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.V(28700);
                            return;
                        case 27:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(28700);
                            ub0Var5.V(16388);
                            return;
                        case 28:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(28700);
                            ub0Var6.V(8200);
                            return;
                        default:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.W(28700);
                            ub0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            f01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            f01Var19 = new f01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            o2Var.presentFragment(new i21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                            p1Var4.C();
                            o2Var5.showDialog(p1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                            p1Var5.C();
                            o2Var6.showDialog(p1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                            p1Var6.C();
                            o2Var7.showDialog(p1Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new ub0());
                            return;
                        case 21:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(3);
                            ub0Var2.V(1);
                            return;
                        case 24:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(3);
                            ub0Var3.V(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.V(28700);
                            return;
                        case 27:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(28700);
                            ub0Var5.V(16388);
                            return;
                        case 28:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(28700);
                            ub0Var6.V(8200);
                            return;
                        default:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.W(28700);
                            ub0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            f01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            f01Var20 = new f01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            o2Var.presentFragment(new i21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                            p1Var4.C();
                            o2Var5.showDialog(p1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                            p1Var5.C();
                            o2Var6.showDialog(p1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                            p1Var6.C();
                            o2Var7.showDialog(p1Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new ub0());
                            return;
                        case 21:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(3);
                            ub0Var2.V(1);
                            return;
                        case 24:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(3);
                            ub0Var3.V(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.V(28700);
                            return;
                        case 27:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(28700);
                            ub0Var5.V(16388);
                            return;
                        case 28:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(28700);
                            ub0Var6.V(8200);
                            return;
                        default:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.W(28700);
                            ub0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            f01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            f01Var21 = new f01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                            p1Var.C();
                            o2Var2.showDialog(p1Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            o2Var.presentFragment(new i21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                            p1Var2.C();
                            o2Var3.showDialog(p1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                            p1Var3.C();
                            o2Var4.showDialog(p1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                            p1Var4.C();
                            o2Var5.showDialog(p1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                            p1Var5.C();
                            o2Var6.showDialog(p1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                            p1Var6.C();
                            o2Var7.showDialog(p1Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new ub0());
                            return;
                        case 21:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(3);
                            ub0Var2.V(1);
                            return;
                        case 24:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(3);
                            ub0Var3.V(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.V(28700);
                            return;
                        case 27:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(28700);
                            ub0Var5.V(16388);
                            return;
                        case 28:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(28700);
                            ub0Var6.V(8200);
                            return;
                        default:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.W(28700);
                            ub0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            f01Var21 = null;
        }
        f01 f01Var124 = new f01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var124.a("tg://settings/power-saving");
        f01 f01Var125 = new f01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var125.a("tg://settings/power-saving/stickers");
        f01 f01Var126 = new f01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var127 = new f01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var128 = new f01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01Var128.a("tg://settings/power-saving/emoji");
        f01 f01Var129 = new f01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var130 = new f01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var131 = new f01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var2, 5, false);
                        p1Var.C();
                        o2Var2.showDialog(p1Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        o2Var.presentFragment(new i21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var2 = new cg.p1(o2Var3, 9, false);
                        p1Var2.C();
                        o2Var3.showDialog(p1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        cg.p1 p1Var3 = new cg.p1(o2Var4, 6, false);
                        p1Var3.C();
                        o2Var4.showDialog(p1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        cg.p1 p1Var4 = new cg.p1(o2Var5, 7, false);
                        p1Var4.C();
                        o2Var5.showDialog(p1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        cg.p1 p1Var5 = new cg.p1(o2Var6, 10, false);
                        p1Var5.C();
                        o2Var6.showDialog(p1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        cg.p1 p1Var6 = new cg.p1(o2Var7, 12, false);
                        p1Var6.C();
                        o2Var7.showDialog(p1Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new ub0());
                        return;
                    case 21:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(3);
                        ub0Var2.V(1);
                        return;
                    case 24:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(3);
                        ub0Var3.V(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.V(28700);
                        return;
                    case 27:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(28700);
                        ub0Var5.V(16388);
                        return;
                    case 28:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(28700);
                        ub0Var6.V(8200);
                        return;
                    default:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.W(28700);
                        ub0Var7.V(4112);
                        return;
                }
            }
        });
        f01 f01Var132 = new f01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var132.a("tg://settings/power-saving/effects");
        f01 f01Var133 = new f01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var133.a("tg://settings/power-saving/background");
        f01 f01Var134 = new f01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01 f01Var135 = new f01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            f01Var22 = new f01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(360928);
                            return;
                        case 1:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(360928);
                            ub0Var2.V(32);
                            return;
                        case 2:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(360928);
                            ub0Var3.V(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.W(360928);
                            ub0Var4.V(128);
                            return;
                        case 5:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(360928);
                            ub0Var5.V(256);
                            return;
                        case 6:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(360928);
                            ub0Var6.V(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.V(512);
                            return;
                        case 9:
                            ub0 ub0Var8 = new ub0();
                            o2Var.presentFragment(ub0Var8);
                            ub0Var8.V(1024);
                            return;
                        case 10:
                            ub0 ub0Var9 = new ub0();
                            o2Var.presentFragment(ub0Var9);
                            ub0Var9.V(2048);
                            return;
                        case 11:
                            ub0 ub0Var10 = new ub0();
                            o2Var.presentFragment(ub0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ub0Var10.f43221s;
                                if (i10 < arrayList.size()) {
                                    if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                        ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                            return;
                        case 17:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                            p1Var.C();
                            o2Var3.showDialog(p1Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            o2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            bx0 bx0Var = new bx0();
                            bx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(bx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            f01Var22 = null;
        }
        f01 f01Var136 = new f01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01 f01Var137 = new f01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var137.a("tg://settings/power-saving/call-animations");
        f01 f01Var138 = new f01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var138.a("tg://settings/power-saving/videos");
        f01 f01Var139 = new f01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var139.a("tg://settings/power-saving/gifs");
        f01 f01Var140 = new f01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var140.a("tg://settings/power-saving/transitions");
        f01 f01Var141 = new f01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var141.a("tg://settings/language");
        f01 f01Var142 = new f01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            f01 f01Var143 = new f01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ub0 ub0Var = new ub0();
                            o2Var.presentFragment(ub0Var);
                            ub0Var.V(360928);
                            return;
                        case 1:
                            ub0 ub0Var2 = new ub0();
                            o2Var.presentFragment(ub0Var2);
                            ub0Var2.W(360928);
                            ub0Var2.V(32);
                            return;
                        case 2:
                            ub0 ub0Var3 = new ub0();
                            o2Var.presentFragment(ub0Var3);
                            ub0Var3.W(360928);
                            ub0Var3.V(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ub0 ub0Var4 = new ub0();
                            o2Var.presentFragment(ub0Var4);
                            ub0Var4.W(360928);
                            ub0Var4.V(128);
                            return;
                        case 5:
                            ub0 ub0Var5 = new ub0();
                            o2Var.presentFragment(ub0Var5);
                            ub0Var5.W(360928);
                            ub0Var5.V(256);
                            return;
                        case 6:
                            ub0 ub0Var6 = new ub0();
                            o2Var.presentFragment(ub0Var6);
                            ub0Var6.W(360928);
                            ub0Var6.V(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ub0 ub0Var7 = new ub0();
                            o2Var.presentFragment(ub0Var7);
                            ub0Var7.V(512);
                            return;
                        case 9:
                            ub0 ub0Var8 = new ub0();
                            o2Var.presentFragment(ub0Var8);
                            ub0Var8.V(1024);
                            return;
                        case 10:
                            ub0 ub0Var9 = new ub0();
                            o2Var.presentFragment(ub0Var9);
                            ub0Var9.V(2048);
                            return;
                        case 11:
                            ub0 ub0Var10 = new ub0();
                            o2Var.presentFragment(ub0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ub0Var10.f43221s;
                                if (i10 < arrayList.size()) {
                                    if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                        ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                            return;
                        case 17:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                            p1Var.C();
                            o2Var3.showDialog(p1Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            o2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            bx0 bx0Var = new bx0();
                            bx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(bx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            f01Var143.a("tg://settings/language/do-not-translate");
            f01Var43 = f01Var143;
        }
        f01 f01Var144 = new f01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var144.a("tg://settings/ask-question");
        f01 f01Var145 = new f01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var145.a("tg://settings/faq");
        f01 f01Var146 = new f01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ub0 ub0Var = new ub0();
                        o2Var.presentFragment(ub0Var);
                        ub0Var.V(360928);
                        return;
                    case 1:
                        ub0 ub0Var2 = new ub0();
                        o2Var.presentFragment(ub0Var2);
                        ub0Var2.W(360928);
                        ub0Var2.V(32);
                        return;
                    case 2:
                        ub0 ub0Var3 = new ub0();
                        o2Var.presentFragment(ub0Var3);
                        ub0Var3.W(360928);
                        ub0Var3.V(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ub0 ub0Var4 = new ub0();
                        o2Var.presentFragment(ub0Var4);
                        ub0Var4.W(360928);
                        ub0Var4.V(128);
                        return;
                    case 5:
                        ub0 ub0Var5 = new ub0();
                        o2Var.presentFragment(ub0Var5);
                        ub0Var5.W(360928);
                        ub0Var5.V(256);
                        return;
                    case 6:
                        ub0 ub0Var6 = new ub0();
                        o2Var.presentFragment(ub0Var6);
                        ub0Var6.W(360928);
                        ub0Var6.V(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ub0 ub0Var7 = new ub0();
                        o2Var.presentFragment(ub0Var7);
                        ub0Var7.V(512);
                        return;
                    case 9:
                        ub0 ub0Var8 = new ub0();
                        o2Var.presentFragment(ub0Var8);
                        ub0Var8.V(1024);
                        return;
                    case 10:
                        ub0 ub0Var9 = new ub0();
                        o2Var.presentFragment(ub0Var9);
                        ub0Var9.V(2048);
                        return;
                    case 11:
                        ub0 ub0Var10 = new ub0();
                        o2Var.presentFragment(ub0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ub0Var10.f43221s;
                            if (i10 < arrayList.size()) {
                                if (((ob0) arrayList.get(i10)).f41080f == 1) {
                                    ub0Var10.f43215b.e1(new eg.n2(ub0Var10, i10, 11), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.c5.U(o2Var2, null));
                        return;
                    case 17:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ye.d.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        cg.p1 p1Var = new cg.p1(o2Var3, 0, false);
                        p1Var.C();
                        o2Var3.showDialog(p1Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        o2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        bx0 bx0Var = new bx0();
                        bx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(bx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        f01Var146.a("tg://settings/privacy-policy");
        return new f01[]{f01Var23, f01Var24, f01Var25, f01Var26, f01Var27, f01Var28, f01Var29, f01Var30, f01Var31, f01Var32, f01Var33, f01Var34, f01Var35, f01Var36, f01Var37, f01Var38, f01Var39, f01Var, f01Var41, f01Var42, f01Var2, f01Var44, f01Var45, f01Var46, f01Var47, f01Var48, f01Var49, f01Var50, f01Var51, f01Var52, f01Var53, f01Var3, f01Var54, f01Var55, f01Var56, f01Var57, f01Var58, f01Var59, f01Var60, f01Var61, f01Var62, f01Var63, f01Var64, f01Var65, f01Var66, f01Var67, f01Var68, f01Var69, f01Var70, f01Var71, f01Var72, f01Var73, f01Var74, f01Var75, f01Var76, f01Var77, f01Var78, f01Var79, f01Var80, f01Var81, f01Var82, f01Var83, f01Var84, f01Var85, f01Var86, f01Var87, f01Var88, f01Var89, f01Var90, f01Var91, f01Var92, f01Var93, f01Var94, f01Var95, f01Var96, f01Var97, f01Var98, f01Var99, f01Var100, f01Var101, f01Var102, f01Var103, f01Var104, f01Var105, f01Var106, f01Var107, f01Var108, f01Var109, f01Var110, f01Var111, f01Var112, f01Var113, f01Var5, f01Var115, f01Var6, f01Var117, f01Var7, f01Var119, f01Var120, f01Var121, f01Var122, f01Var4, f01Var8, f01Var9, f01Var10, f01Var11, f01Var12, f01Var13, f01Var14, f01Var15, f01Var16, f01Var17, f01Var18, f01Var19, f01Var20, f01Var21, f01Var124, f01Var125, f01Var126, f01Var127, f01Var128, f01Var129, f01Var130, f01Var131, f01Var132, f01Var133, f01Var134, f01Var135, f01Var22, f01Var136, f01Var137, f01Var138, f01Var139, f01Var140, f01Var141, f01Var142, f01Var43, f01Var144, f01Var145, f01Var146};
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
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
        if (!this.f38416w) {
            l();
        }
        if (arrayList.size() > 20) {
            a4.w.t(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof f01) {
                ((f01) obj2).f37948g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f38412f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i10).faqWebPage;
        this.A = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i10).faqSearchArray);
        }
        if (this.A == null && !this.B) {
            this.B = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new o(this, 20));
        }
    }

    public final void I(String str) {
        this.f38418y = str;
        if (this.f38417x != null) {
            Utilities.searchQueue.cancelRunnable(this.f38417x);
            this.f38417x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f38416w = false;
            this.f38414r.clear();
            this.f38415s.clear();
            this.f38413n.clear();
            org.telegram.ui.ActionBar.o2 o2Var = this.f38411e;
            if (o2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) o2Var).L.f32120b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.f38411e).L.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        av0 av0Var = new av0(20, this, str);
        this.f38417x = av0Var;
        dispatchQueue.postRunnable(av0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        f01 f01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            f01[] f01VarArr = this.f38410c;
            if (i10 >= f01VarArr.length) {
                break;
            }
            f01 f01Var2 = f01VarArr[i10];
            if (f01Var2 != null) {
                hashMap.put(Integer.valueOf(f01Var2.f37947f), this.f38410c[i10]);
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
                    } else if (readInt322 == 1 && (f01Var = (f01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        f01Var.f37948g = readInt32;
                        arrayList.add(f01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.wp0(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f38416w) {
            int size2 = this.f38414r.size();
            if (!this.f38415s.isEmpty()) {
                i10 = this.f38415s.size() + 1;
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
        if (this.f38416w) {
            if (i10 < this.f38414r.size() || i10 != this.f38414r.size()) {
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
    public final void v(f2.n1 n1Var, int i10) {
        f01 f01Var;
        int i11;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ((org.telegram.ui.Cells.k4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
            return;
        }
        org.telegram.ui.Cells.u6 u6Var = (org.telegram.ui.Cells.u6) view;
        boolean z11 = false;
        if (this.f38416w) {
            if (i10 < this.f38414r.size()) {
                f01 f01Var2 = (f01) this.f38414r.get(i10);
                if (i10 > 0) {
                    f01Var = (f01) this.f38414r.get(i10 - 1);
                } else {
                    f01Var = null;
                }
                if (f01Var != null && f01Var.f37946e == f01Var2.f37946e) {
                    i11 = 0;
                } else {
                    i11 = f01Var2.f37946e;
                }
                CharSequence charSequence = (CharSequence) this.f38413n.get(i10);
                String[] strArr = f01Var2.d;
                if (i10 >= this.f38414r.size() - 1) {
                    z10 = false;
                }
                u6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int e10 = th.e(1, i10, this.f38414r);
            CharSequence charSequence2 = (CharSequence) this.f38413n.get(this.f38414r.size() + e10);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f38415s.get(e10)).path;
            if (e10 < this.f38414r.size() - 1) {
                z11 = true;
            }
            u6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof f01) {
                f01 f01Var3 = (f01) obj;
                String str = f01Var3.f37943a;
                String[] strArr3 = f01Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                u6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i10 < arrayList.size() - 1) {
                    z11 = true;
                }
                u6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int e11 = th.e(1, i10, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(e11);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (e11 < arrayList.size() - 1) {
            z11 = true;
        }
        u6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View u6Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                u6Var = new org.telegram.ui.Cells.k4(context, 16);
            } else {
                u6Var = new org.telegram.ui.Cells.s3(context, null);
            }
        } else {
            u6Var = new org.telegram.ui.Cells.u6(context);
        }
        u6Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(u6Var);
    }
}
