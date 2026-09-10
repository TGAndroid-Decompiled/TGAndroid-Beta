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
public class p11 extends org.telegram.ui.Components.ul0 {
    public TLRPC.WebPage E;
    public boolean F;
    public o11[] f35662c;
    public final org.telegram.ui.ActionBar.p2 e;
    public final int f35663f;
    public final Context h;
    public boolean f35667w;
    public ey0 f35668x;
    public String f35669y;
    public final ArrayList d = new ArrayList();
    public ArrayList f35664n = new ArrayList();
    public ArrayList f35665r = new ArrayList();
    public ArrayList f35666s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public p11(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = p2Var;
        this.f35663f = p2Var.getCurrentAccount();
        this.h = context;
        this.f35662c = H(p2Var);
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

    public static o11[] H(final org.telegram.ui.ActionBar.p2 p2Var) {
        o11 o11Var;
        o11 o11Var2;
        o11 o11Var3;
        o11 o11Var4;
        o11 o11Var5;
        o11 o11Var6;
        o11 o11Var7;
        o11 o11Var8;
        o11 o11Var9;
        o11 o11Var10;
        o11 o11Var11;
        o11 o11Var12;
        o11 o11Var13;
        o11 o11Var14;
        o11 o11Var15;
        o11 o11Var16;
        o11 o11Var17;
        o11 o11Var18;
        o11 o11Var19;
        o11 o11Var20;
        o11 o11Var21;
        o11 o11Var22;
        final int currentAccount = p2Var.getCurrentAccount();
        o11 o11Var23 = new o11(LocaleController.getString(R.string.EditName), 500, 0, new ey0(13, p2Var, p2Var.getResourceProvider()));
        o11 o11Var24 = new o11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var24.a("tg://settings/edit/change-number");
        o11 o11Var25 = new o11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var25.a("tg://settings/edit/add-account");
        o11 o11Var26 = new o11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var26.a("tg://settings/notifications");
        o11 o11Var27 = new o11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11Var27.a("tg://settings/notifications/private-chats");
        o11 o11Var28 = new o11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11Var28.a("tg://settings/notifications/groups");
        o11 o11Var29 = new o11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(8, p2Var));
        o11Var29.a("tg://settings/notifications/channels");
        o11 o11Var30 = new o11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(20, p2Var));
        o11 o11Var31 = new o11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var32 = new o11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var33 = new o11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(23, p2Var));
        o11Var33.a("tg://settings/notifications/new-contacts");
        o11 o11Var34 = new o11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var34.a("tg://settings/notifications/pinned-messages");
        o11 o11Var35 = new o11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var35.a("tg://settings/notifications/reset");
        o11 o11Var36 = new o11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11 o11Var37 = new o11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11 o11Var38 = new o11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11 o11Var39 = new o11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var39.a("tg://settings/privacy");
        o11 o11Var40 = new o11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var40.a("tg://settings/privacy/2sv");
        o11 o11Var41 = new o11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            p2Var.presentFragment(new q4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(p2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), null);
                            xbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new bi.pd(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            xbVar.f29000b.setText(spannableStringBuilder);
                            xbVar.f29000b.setSingleLine(false);
                            xbVar.f29000b.setMaxLines(2);
                            a02.b(xbVar, 2750).j();
                            return;
                        }
                        p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        o11Var41.a("tg://settings/privacy/auto-delete");
        o11 o11Var42 = new o11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var42.a("tg://settings/privacy/passcode");
        o11 o11Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            o11Var = o11Var40;
            o11Var2 = new o11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f35215s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                        nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            return;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            o11Var2.a("tg://settings/privacy/login-email");
        } else {
            o11Var = o11Var40;
            o11Var2 = null;
        }
        o11 o11Var44 = new o11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var44.a("tg://settings/privacy/blocked");
        o11 o11Var45 = new o11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var45.a("tg://settings/devices");
        o11 o11Var46 = new o11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var46.a("tg://settings/privacy/phone-number/");
        o11 o11Var47 = new o11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var47.a("tg://settings/privacy/last-seen");
        o11 o11Var48 = new o11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var48.a("tg://settings/privacy/profile-photos");
        o11 o11Var49 = new o11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var49.a("tg://settings/privacy/forwards");
        o11 o11Var50 = new o11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var50.a("tg://settings/privacy/calls/p2p");
        o11 o11Var51 = new o11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var51.a("tg://settings/privacy/calls");
        o11 o11Var52 = new o11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var52.a("tg://settings/privacy/invites");
        o11 o11Var53 = new o11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            p2Var.presentFragment(new q4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(p2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), null);
                            xbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new bi.pd(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            xbVar.f29000b.setText(spannableStringBuilder);
                            xbVar.f29000b.setSingleLine(false);
                            xbVar.f29000b.setMaxLines(2);
                            a02.b(xbVar, 2750).j();
                            return;
                        }
                        p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        o11Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            o11Var3 = new o11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                p2Var.presentFragment(new xg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            p2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            p2Var.presentFragment(new y6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 27:
                            p2Var.presentFragment(new y6());
                            return;
                        case 28:
                            p2Var.presentFragment(new y6());
                            return;
                        default:
                            p2Var.presentFragment(new y6());
                            return;
                    }
                }
            });
            o11Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            o11Var3 = null;
        }
        o11 o11Var54 = new o11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var54.a("tg://settings/privacy/self-destruct");
        o11 o11Var55 = new o11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        o11 o11Var56 = new o11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var56.a("tg://settings/privacy/active-websites");
        o11 o11Var57 = new o11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var57.a("tg://settings/privacy/data-settings/delete-synced");
        o11 o11Var58 = new o11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        o11 o11Var59 = new o11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        o11 o11Var60 = new o11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var60.a("tg://settings/privacy/data-settings/map-provider");
        o11 o11Var61 = new o11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var61.a("tg://settings/privacy/data-settings/link-previews");
        o11 o11Var62 = new o11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var62.a("tg://settings/devices");
        o11 o11Var63 = new o11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var63.a("tg://settings/devices/terminate-sessions");
        o11 o11Var64 = new o11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var64.a("tg://settings/devices/link-desktop");
        o11 o11Var65 = new o11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var65.a("tg://settings/privacy/data-settings");
        o11 o11Var66 = new o11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11 o11Var67 = new o11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11Var67.a("tg://settings/data/storage");
        o11 o11Var68 = new o11(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11 o11Var69 = new o11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11 o11Var70 = new o11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            p2Var.presentFragment(new xg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new y6());
                        return;
                    case 28:
                        p2Var.presentFragment(new y6());
                        return;
                    default:
                        p2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        o11 o11Var71 = new o11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11Var71.a("tg://settings/data/usage");
        o11 o11Var72 = new o11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var73 = new o11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var74 = new o11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var75 = new o11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var76 = new o11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11Var76.a("tg://settings/data/auto-download/reset");
        o11 o11Var77 = new o11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var78 = new o11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var79 = new o11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var80 = new o11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11Var80.a("tg://settings/data/use-less-data");
        o11 o11Var81 = new o11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var82 = new o11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11Var82.a("tg://settings/data/proxy");
        o11 o11Var83 = new o11(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11Var83.a("tg://settings/data/proxy/use-for-calls");
        o11 o11Var84 = new o11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        o11 o11Var85 = new o11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        o11 o11Var86 = new o11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(2, p2Var));
        o11Var86.a("tg://settings/data/save-to-photos/chats");
        o11 o11Var87 = new o11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(3, p2Var));
        o11Var87.a("tg://settings/data/save-to-photos/groups");
        o11 o11Var88 = new o11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(4, p2Var));
        o11Var88.a("tg://settings/data/save-to-photos/channels");
        o11 o11Var89 = new o11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ri0(5, p2Var));
        o11Var89.a("tg://settings/appearance/themes");
        o11 o11Var90 = new o11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(6, p2Var));
        o11Var90.a("tg://settings/appearance/text-size");
        o11 o11Var91 = new o11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(7, p2Var));
        o11Var91.a("tg://settings/appearance/wallpapers");
        o11 o11Var92 = new o11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(9, p2Var));
        o11 o11Var93 = new o11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(10, p2Var));
        o11 o11Var94 = new o11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(11, p2Var));
        o11 o11Var95 = new o11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(13, p2Var));
        o11 o11Var96 = new o11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ri0(14, p2Var));
        o11Var96.a("tg://settings/appearance/themes/create");
        o11 o11Var97 = new o11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(15, p2Var));
        o11Var97.a("tg://settings/appearance/message-corners");
        o11 o11Var98 = new o11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(16, p2Var));
        o11 o11Var99 = new o11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(17, p2Var));
        o11 o11Var100 = new o11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(18, p2Var));
        o11Var100.a("tg://settings/appearance/app-icon");
        o11 o11Var101 = new o11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(19, p2Var));
        o11 o11Var102 = new o11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(21, p2Var));
        o11Var102.a("tg://settings/appearance/tap-for-next-media");
        o11 o11Var103 = new o11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(22, p2Var));
        o11Var103.a("tg://settings/data/raise-to-listen");
        o11 o11Var104 = new o11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(24, p2Var));
        o11Var104.a("tg://settings/data/raise-to-speak");
        o11 o11Var105 = new o11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(25, p2Var));
        o11Var105.a("tg://settings/data/pause-music");
        o11 o11Var106 = new o11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(26, p2Var));
        o11 o11Var107 = new o11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(27, p2Var));
        o11 o11Var108 = new o11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(28, p2Var));
        o11 o11Var109 = new o11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(29, p2Var));
        o11 o11Var110 = new o11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var110.a("tg://settings/appearance/stickers-and-emoji");
        o11 o11Var111 = new o11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var112 = new o11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var113 = new o11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var114 = new o11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        o11 o11Var115 = new o11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var116 = new o11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        o11 o11Var117 = new o11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var118 = new o11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        o11 o11Var119 = new o11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        o11 o11Var120 = new o11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var121 = new o11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        o11 o11Var122 = new o11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var122.a("tg://settings/folders");
        o11 o11Var123 = new o11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            o11Var4 = o11Var123;
            o11Var5 = o11Var114;
            o11Var6 = o11Var116;
            o11Var7 = o11Var118;
            o11Var8 = new o11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f35215s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                        nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            return;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            o11Var4 = o11Var123;
            o11Var5 = o11Var114;
            o11Var6 = o11Var116;
            o11Var7 = o11Var118;
            o11Var8 = null;
        }
        if (F(currentAccount, 0)) {
            o11Var9 = new o11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f35215s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                        nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            return;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            o11Var9 = null;
        }
        if (F(currentAccount, 11)) {
            o11Var10 = new o11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                p2Var.presentFragment(new xg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            p2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            p2Var.presentFragment(new y6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 27:
                            p2Var.presentFragment(new y6());
                            return;
                        case 28:
                            p2Var.presentFragment(new y6());
                            return;
                        default:
                            p2Var.presentFragment(new y6());
                            return;
                    }
                }
            });
        } else {
            o11Var10 = null;
        }
        if (F(currentAccount, 1)) {
            o11Var11 = new o11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                p2Var.presentFragment(new xg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            p2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            p2Var.presentFragment(new y6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 27:
                            p2Var.presentFragment(new y6());
                            return;
                        case 28:
                            p2Var.presentFragment(new y6());
                            return;
                        default:
                            p2Var.presentFragment(new y6());
                            return;
                    }
                }
            });
        } else {
            o11Var11 = null;
        }
        if (F(currentAccount, 2)) {
            o11Var12 = new o11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                p2Var.presentFragment(new xg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            p2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            p2Var.presentFragment(new y6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 27:
                            p2Var.presentFragment(new y6());
                            return;
                        case 28:
                            p2Var.presentFragment(new y6());
                            return;
                        default:
                            p2Var.presentFragment(new y6());
                            return;
                    }
                }
            });
        } else {
            o11Var12 = null;
        }
        if (F(currentAccount, 8)) {
            o11Var13 = new o11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                            return;
                        case 1:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 4:
                            p2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 5:
                            p2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 6:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 7:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 8:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 14:
                            p2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 15:
                            p2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 16:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                    }
                }
            });
        } else {
            o11Var13 = null;
        }
        if (F(currentAccount, 3)) {
            o11Var14 = new o11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                            return;
                        case 1:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 4:
                            p2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 5:
                            p2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 6:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 7:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 8:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 14:
                            p2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 15:
                            p2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 16:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                    }
                }
            });
        } else {
            o11Var14 = null;
        }
        if (F(currentAccount, 4)) {
            o11Var15 = new o11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ri0(12, p2Var));
        } else {
            o11Var15 = null;
        }
        if (F(currentAccount, 5)) {
            o11Var16 = new o11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new r31());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            o11Var16 = null;
        }
        if (F(currentAccount, 9)) {
            o11Var17 = new o11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new r31());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            o11Var17 = null;
        }
        if (F(currentAccount, 6)) {
            o11Var18 = new o11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new r31());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            o11Var18 = null;
        }
        if (F(currentAccount, 7)) {
            o11Var19 = new o11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new r31());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            o11Var19 = null;
        }
        if (F(currentAccount, 10)) {
            o11Var20 = new o11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new r31());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            o11Var20 = null;
        }
        if (F(currentAccount, 12)) {
            o11Var21 = new o11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new r31());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            o11Var21 = null;
        }
        o11 o11Var124 = new o11(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var124.a("tg://settings/power-saving");
        o11 o11Var125 = new o11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var125.a("tg://settings/power-saving/stickers");
        o11 o11Var126 = new o11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var127 = new o11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var128 = new o11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11Var128.a("tg://settings/power-saving/emoji");
        o11 o11Var129 = new o11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var130 = new o11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var131 = new o11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new r31());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        o11 o11Var132 = new o11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var132.a("tg://settings/power-saving/effects");
        o11 o11Var133 = new o11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var133.a("tg://settings/power-saving/background");
        o11 o11Var134 = new o11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11 o11Var135 = new o11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            o11Var22 = new o11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f35215s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                        nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            return;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            o11Var22 = null;
        }
        o11 o11Var136 = new o11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11 o11Var137 = new o11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var137.a("tg://settings/power-saving/call-animations");
        o11 o11Var138 = new o11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var138.a("tg://settings/power-saving/videos");
        o11 o11Var139 = new o11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var139.a("tg://settings/power-saving/gifs");
        o11 o11Var140 = new o11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var140.a("tg://settings/power-saving/transitions");
        o11 o11Var141 = new o11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var141.a("tg://settings/language");
        o11 o11Var142 = new o11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            o11 o11Var143 = new o11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f35215s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                        nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            return;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            o11Var143.a("tg://settings/language/do-not-translate");
            o11Var43 = o11Var143;
        }
        o11 o11Var144 = new o11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var144.a("tg://settings/ask-question");
        o11 o11Var145 = new o11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var145.a("tg://settings/faq");
        o11 o11Var146 = new o11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f35215s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f33345f == 1) {
                                    nc0Var10.f35210b.d1(new i2.s(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        return;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        o11Var146.a("tg://settings/privacy-policy");
        return new o11[]{o11Var23, o11Var24, o11Var25, o11Var26, o11Var27, o11Var28, o11Var29, o11Var30, o11Var31, o11Var32, o11Var33, o11Var34, o11Var35, o11Var36, o11Var37, o11Var38, o11Var39, o11Var, o11Var41, o11Var42, o11Var2, o11Var44, o11Var45, o11Var46, o11Var47, o11Var48, o11Var49, o11Var50, o11Var51, o11Var52, o11Var53, o11Var3, o11Var54, o11Var55, o11Var56, o11Var57, o11Var58, o11Var59, o11Var60, o11Var61, o11Var62, o11Var63, o11Var64, o11Var65, o11Var66, o11Var67, o11Var68, o11Var69, o11Var70, o11Var71, o11Var72, o11Var73, o11Var74, o11Var75, o11Var76, o11Var77, o11Var78, o11Var79, o11Var80, o11Var81, o11Var82, o11Var83, o11Var84, o11Var85, o11Var86, o11Var87, o11Var88, o11Var89, o11Var90, o11Var91, o11Var92, o11Var93, o11Var94, o11Var95, o11Var96, o11Var97, o11Var98, o11Var99, o11Var100, o11Var101, o11Var102, o11Var103, o11Var104, o11Var105, o11Var106, o11Var107, o11Var108, o11Var109, o11Var110, o11Var111, o11Var112, o11Var113, o11Var5, o11Var115, o11Var6, o11Var117, o11Var7, o11Var119, o11Var120, o11Var121, o11Var122, o11Var4, o11Var8, o11Var9, o11Var10, o11Var11, o11Var12, o11Var13, o11Var14, o11Var15, o11Var16, o11Var17, o11Var18, o11Var19, o11Var20, o11Var21, o11Var124, o11Var125, o11Var126, o11Var127, o11Var128, o11Var129, o11Var130, o11Var131, o11Var132, o11Var133, o11Var134, o11Var135, o11Var22, o11Var136, o11Var137, o11Var138, o11Var139, o11Var140, o11Var141, o11Var142, o11Var43, o11Var144, o11Var145, o11Var146};
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
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
        if (!this.f35667w) {
            l();
        }
        if (arrayList.size() > 20) {
            a4.a.x(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof o11) {
                ((o11) obj2).f35385g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f35663f;
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
        this.f35669y = str;
        if (this.f35668x != null) {
            Utilities.searchQueue.cancelRunnable(this.f35668x);
            this.f35668x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f35667w = false;
            this.f35665r.clear();
            this.f35666s.clear();
            this.f35664n.clear();
            org.telegram.ui.ActionBar.p2 p2Var = this.e;
            if (p2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) p2Var).P.f24510b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ey0 ey0Var = new ey0(14, this, str);
        this.f35668x = ey0Var;
        dispatchQueue.postRunnable(ey0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        o11 o11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            o11[] o11VarArr = this.f35662c;
            if (i10 >= o11VarArr.length) {
                break;
            }
            o11 o11Var2 = o11VarArr[i10];
            if (o11Var2 != null) {
                hashMap.put(Integer.valueOf(o11Var2.f35384f), this.f35662c[i10]);
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
                    } else if (readInt322 == 1 && (o11Var = (o11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        o11Var.f35385g = readInt32;
                        arrayList.add(o11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.m9(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f35667w) {
            int size2 = this.f35665r.size();
            if (!this.f35666s.isEmpty()) {
                i10 = this.f35666s.size() + 1;
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
        if (this.f35667w) {
            if (i10 < this.f35665r.size() || i10 != this.f35665r.size()) {
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
    public final void v(s4.c1 c1Var, int i10) {
        o11 o11Var;
        int i11;
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
            return;
        }
        org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
        boolean z11 = false;
        if (this.f35667w) {
            if (i10 < this.f35665r.size()) {
                o11 o11Var2 = (o11) this.f35665r.get(i10);
                if (i10 > 0) {
                    o11Var = (o11) this.f35665r.get(i10 - 1);
                } else {
                    o11Var = null;
                }
                if (o11Var != null && o11Var.e == o11Var2.e) {
                    i11 = 0;
                } else {
                    i11 = o11Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f35664n.get(i10);
                String[] strArr = o11Var2.d;
                if (i10 >= this.f35665r.size() - 1) {
                    z10 = false;
                }
                z6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int e = com.google.android.gms.internal.vision.e2.e(1, i10, this.f35665r);
            CharSequence charSequence2 = (CharSequence) this.f35664n.get(this.f35665r.size() + e);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f35666s.get(e)).path;
            if (e < this.f35665r.size() - 1) {
                z11 = true;
            }
            z6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof o11) {
                o11 o11Var3 = (o11) obj;
                String str = o11Var3.f35381a;
                String[] strArr3 = o11Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                z6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i10 < arrayList.size() - 1) {
                    z11 = true;
                }
                z6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int e7 = com.google.android.gms.internal.vision.e2.e(1, i10, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(e7);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (e7 < arrayList.size() - 1) {
            z11 = true;
        }
        z6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View z6Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                z6Var = new org.telegram.ui.Cells.m4(context, 16);
            } else {
                z6Var = new org.telegram.ui.Cells.u3(context, null);
            }
        } else {
            z6Var = new org.telegram.ui.Cells.z6(context);
        }
        z6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(z6Var);
    }
}
