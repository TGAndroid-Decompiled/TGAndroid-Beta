package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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

public class g01 extends org.telegram.ui.Components.yk0 {
    public TLRPC.WebPage A;
    public boolean B;

    public f01[] f38252c;

    public final org.telegram.ui.ActionBar.n2 f38253e;

    public final int f38254f;
    public final Context h;

    public boolean f38258w;

    public zs0 f38259x;

    public String f38260y;
    public final ArrayList d = new ArrayList();

    public ArrayList f38255n = new ArrayList();

    public ArrayList f38256r = new ArrayList();

    public ArrayList f38257s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public g01(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f38253e = n2Var;
        this.f38254f = n2Var.getCurrentAccount();
        this.h = context;
        this.f38252c = H(n2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() || UserConfig.getInstance(i10).isPremium()) {
            return i11 == -1 || MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) != -1;
        }
        return false;
    }

    public static f01[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
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
        final int currentAccount = n2Var.getCurrentAccount();
        final int i10 = 22;
        f01 f01Var17 = new f01(LocaleController.getString(R.string.EditName), 500, 0, new zs0(22, n2Var, n2Var.getResourceProvider()));
        final int i11 = 26;
        f01 f01Var18 = new f01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i12 < arrayList.size()) {
                                if (((rb0) arrayList.get(i12)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i12, 11), 700, true);
                                } else {
                                    i12++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var18.a("tg://settings/edit/change-number");
        final int i12 = 8;
        f01 f01Var19 = new f01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 4) {
                                i13 = -1;
                            } else if (UserConfig.getInstance(i13).isClientActivated()) {
                                i13++;
                            }
                        }
                        if (i13 >= 0) {
                            n2Var.presentFragment(new ig0(i13));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var19.a("tg://settings/edit/add-account");
        final int i13 = 19;
        final int i14 = 1;
        f01 f01Var20 = new f01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i15 = 0;
                        while (true) {
                            if (i15 >= 4) {
                                i15 = -1;
                            } else if (UserConfig.getInstance(i15).isClientActivated()) {
                                i15++;
                            }
                        }
                        if (i15 >= 0) {
                            n2Var.presentFragment(new ig0(i15));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var20.a("tg://settings/notifications");
        f01 f01Var21 = new f01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i14) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01Var21.a("tg://settings/notifications/private-chats");
        final int i15 = 13;
        f01 f01Var22 = new f01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i15) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01Var22.a("tg://settings/notifications/groups");
        f01 f01Var23 = new f01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(i12, n2Var));
        f01Var23.a("tg://settings/notifications/channels");
        f01 f01Var24 = new f01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(20, n2Var));
        final int i16 = 2;
        f01 f01Var25 = new f01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i16) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i17 = 14;
        f01 f01Var26 = new f01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i17) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01 f01Var27 = new f01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(23, n2Var));
        f01Var27.a("tg://settings/notifications/new-contacts");
        final int i18 = 25;
        f01 f01Var28 = new f01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i18) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var28.a("tg://settings/notifications/pinned-messages");
        final int i19 = 7;
        f01 f01Var29 = new f01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i19) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var29.a("tg://settings/notifications/reset");
        f01 f01Var30 = new f01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i20 = 20;
        f01 f01Var31 = new f01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i20) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i21 = 21;
        f01 f01Var32 = new f01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (i21) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01 f01Var33 = new f01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var33.a("tg://settings/privacy");
        final int i22 = 23;
        f01 f01Var34 = new f01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i22) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var34.a("tg://settings/privacy/2sv");
        final int i23 = 0;
        f01 f01Var35 = new f01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i23) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new q4());
                        }
                        break;
                    default:
                        boolean zIsPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!zIsPremium) {
                            org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(n2Var2);
                            mcVarA0.getClass();
                            org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(mcVarA0.W(), null);
                            mbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int iIndexOf = string.indexOf(42);
                            int iLastIndexOf = string.lastIndexOf(42);
                            if (iIndexOf >= 0) {
                                spannableStringBuilder.replace(iIndexOf, iLastIndexOf + 1, (CharSequence) string.substring(iIndexOf + 1, iLastIndexOf));
                                spannableStringBuilder.setSpan(new ag.x0(mcVarA0, 6), iIndexOf, iLastIndexOf - 1, 33);
                            }
                            mbVar.f30639b.setText(spannableStringBuilder);
                            mbVar.f30639b.setSingleLine(false);
                            mbVar.f30639b.setMaxLines(2);
                            mcVarA0.b(mbVar, 2750).j();
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        }
                        break;
                }
            }
        });
        f01Var35.a("tg://settings/privacy/auto-delete");
        final int i24 = 25;
        f01 f01Var36 = new f01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i24) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var36.a("tg://settings/privacy/passcode");
        f01 f01Var37 = null;
        if (SharedConfig.hasEmailLogin) {
            final int i25 = 27;
            f01Var = new f01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (i25) {
                        case 0:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(360928);
                            break;
                        case 1:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(360928);
                            xb0Var2.V(32);
                            break;
                        case 2:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(360928);
                            xb0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.W(360928);
                            xb0Var4.V(128);
                            break;
                        case 5:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(360928);
                            xb0Var5.V(256);
                            break;
                        case 6:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(360928);
                            xb0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.V(512);
                            break;
                        case 9:
                            xb0 xb0Var8 = new xb0();
                            n2Var.presentFragment(xb0Var8);
                            xb0Var8.V(1024);
                            break;
                        case 10:
                            xb0 xb0Var9 = new xb0();
                            n2Var.presentFragment(xb0Var9);
                            xb0Var9.V(2048);
                            break;
                        case 11:
                            xb0 xb0Var10 = new xb0();
                            n2Var.presentFragment(xb0Var10);
                            int i110 = 0;
                            while (true) {
                                ArrayList arrayList = xb0Var10.f44379s;
                                if (i110 < arrayList.size()) {
                                    if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                        xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                    } else {
                                        i110++;
                                    }
                                }
                                break;
                            }
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                            break;
                        case 17:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                            g2Var.D();
                            n2Var3.showDialog(g2Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(cx0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            f01Var.a("tg://settings/privacy/login-email");
        } else {
            f01Var = null;
        }
        final int i26 = 28;
        f01 f01Var38 = new f01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i26) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var38.a("tg://settings/privacy/blocked");
        final int i27 = 29;
        f01 f01Var39 = new f01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i27) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var39.a("tg://settings/devices");
        final int i28 = 0;
        f01 f01Var40 = new f01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i28) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var40.a("tg://settings/privacy/phone-number/");
        final int i29 = 1;
        f01 f01Var41 = new f01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i29) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var41.a("tg://settings/privacy/last-seen");
        final int i30 = 2;
        f01 f01Var42 = new f01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i30) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var42.a("tg://settings/privacy/profile-photos");
        final int i31 = 3;
        f01 f01Var43 = new f01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i31) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var43.a("tg://settings/privacy/forwards");
        final int i32 = 4;
        f01 f01Var44 = new f01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i32) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var44.a("tg://settings/privacy/calls/p2p");
        final int i33 = 6;
        f01 f01Var45 = new f01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i33) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var45.a("tg://settings/privacy/calls");
        final int i34 = 7;
        f01 f01Var46 = new f01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i34) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var46.a("tg://settings/privacy/invites");
        final int i35 = 1;
        f01 f01Var47 = new f01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i35) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new q4());
                        }
                        break;
                    default:
                        boolean zIsPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!zIsPremium) {
                            org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(n2Var2);
                            mcVarA0.getClass();
                            org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(mcVarA0.W(), null);
                            mbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int iIndexOf = string.indexOf(42);
                            int iLastIndexOf = string.lastIndexOf(42);
                            if (iIndexOf >= 0) {
                                spannableStringBuilder.replace(iIndexOf, iLastIndexOf + 1, (CharSequence) string.substring(iIndexOf + 1, iLastIndexOf));
                                spannableStringBuilder.setSpan(new ag.x0(mcVarA0, 6), iIndexOf, iLastIndexOf - 1, 33);
                            }
                            mbVar.f30639b.setText(spannableStringBuilder);
                            mbVar.f30639b.setSingleLine(false);
                            mbVar.f30639b.setMaxLines(2);
                            mcVarA0.b(mbVar, 2750).j();
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        }
                        break;
                }
            }
        });
        f01Var47.a("tg://settings/privacy/voice");
        final int i36 = 9;
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            f01Var2 = new f01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (i36) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i110 = 0;
                            while (true) {
                                if (i110 >= 4) {
                                    i110 = -1;
                                } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                    i110++;
                                }
                            }
                            if (i110 >= 0) {
                                n2Var.presentFragment(new ig0(i110));
                            }
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            n2Var.presentFragment(new z6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new z6());
                            break;
                        default:
                            n2Var.presentFragment(new z6());
                            break;
                    }
                }
            });
            f01Var2.a("tg://settings/privacy/archive-and-mute");
        } else {
            f01Var2 = null;
        }
        final int i37 = 10;
        f01 f01Var48 = new f01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i37) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var48.a("tg://settings/privacy/self-destruct");
        final int i38 = 11;
        f01 f01Var49 = new f01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i38) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var49.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i39 = 12;
        f01 f01Var50 = new f01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i39) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var50.a("tg://settings/privacy/active-websites");
        final int i40 = 13;
        f01 f01Var51 = new f01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i40) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var51.a("tg://settings/privacy/data-settings/delete-synced");
        final int i41 = 14;
        f01 f01Var52 = new f01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i41) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var52.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i42 = 16;
        f01 f01Var53 = new f01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i42) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var53.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i43 = 17;
        f01 f01Var54 = new f01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i43) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var54.a("tg://settings/privacy/data-settings/map-provider");
        final int i44 = 18;
        f01 f01Var55 = new f01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (i44) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var55.a("tg://settings/privacy/data-settings/link-previews");
        final int i45 = 20;
        f01 f01Var56 = new f01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (i45) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var56.a("tg://settings/devices");
        final int i46 = 21;
        f01 f01Var57 = new f01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (i46) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var57.a("tg://settings/devices/terminate-sessions");
        final int i47 = 22;
        f01 f01Var58 = new f01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (i47) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var58.a("tg://settings/devices/link-desktop");
        final int i48 = 23;
        f01 f01Var59 = new f01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i48) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var59.a("tg://settings/privacy/data-settings");
        final int i49 = 24;
        f01 f01Var60 = new f01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i49) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        final int i50 = 25;
        f01 f01Var61 = new f01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i50) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        f01Var61.a("tg://settings/data/storage");
        final int i51 = 27;
        f01 f01Var62 = new f01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i51) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        final int i52 = 28;
        f01 f01Var63 = new f01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i52) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        final int i53 = 29;
        f01 f01Var64 = new f01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i53) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i110 = 0;
                        while (true) {
                            if (i110 >= 4) {
                                i110 = -1;
                            } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                i110++;
                            }
                        }
                        if (i110 >= 0) {
                            n2Var.presentFragment(new ig0(i110));
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        final int i54 = 0;
        f01 f01Var65 = new f01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i54) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01Var65.a("tg://settings/data/usage");
        final int i55 = 2;
        f01 f01Var66 = new f01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i55) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        f01 f01Var67 = new f01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i56) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        f01 f01Var68 = new f01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i57) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        final int i58 = 5;
        f01 f01Var69 = new f01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i58) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        final int i59 = 6;
        f01 f01Var70 = new f01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i59) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01Var70.a("tg://settings/data/auto-download/reset");
        final int i60 = 8;
        f01 f01Var71 = new f01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i60) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        f01 f01Var72 = new f01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i61) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        final int i62 = 10;
        f01 f01Var73 = new f01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i62) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        final int i63 = 11;
        f01 f01Var74 = new f01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i63) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01Var74.a("tg://settings/data/use-less-data");
        final int i64 = 12;
        f01 f01Var75 = new f01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i64) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        final int i65 = 14;
        f01 f01Var76 = new f01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i65) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01Var76.a("tg://settings/data/proxy");
        final int i66 = 15;
        f01 f01Var77 = new f01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i66) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01Var77.a("tg://settings/data/proxy/use-for-calls");
        final int i67 = 16;
        f01 f01Var78 = new f01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i67) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01Var78.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i68 = 17;
        f01 f01Var79 = new f01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (i68) {
                    case 0:
                        n2Var.presentFragment(new ru(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                }
            }
        });
        f01 f01Var80 = new f01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ci0(2, n2Var));
        f01Var80.a("tg://settings/data/save-to-photos/chats");
        f01 f01Var81 = new f01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ci0(3, n2Var));
        f01Var81.a("tg://settings/data/save-to-photos/groups");
        f01 f01Var82 = new f01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ci0(4, n2Var));
        f01Var82.a("tg://settings/data/save-to-photos/channels");
        f01 f01Var83 = new f01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ci0(5, n2Var));
        f01Var83.a("tg://settings/appearance/themes");
        f01 f01Var84 = new f01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(6, n2Var));
        f01Var84.a("tg://settings/appearance/text-size");
        f01 f01Var85 = new f01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(7, n2Var));
        f01Var85.a("tg://settings/appearance/wallpapers");
        f01 f01Var86 = new f01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ci0(9, n2Var));
        f01 f01Var87 = new f01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ci0(10, n2Var));
        f01 f01Var88 = new f01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(11, n2Var));
        f01 f01Var89 = new f01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(13, n2Var));
        f01 f01Var90 = new f01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ci0(14, n2Var));
        f01Var90.a("tg://settings/appearance/themes/create");
        f01 f01Var91 = new f01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(15, n2Var));
        f01Var91.a("tg://settings/appearance/message-corners");
        f01 f01Var92 = new f01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(16, n2Var));
        f01 f01Var93 = new f01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(17, n2Var));
        f01 f01Var94 = new f01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(18, n2Var));
        f01Var94.a("tg://settings/appearance/app-icon");
        f01 f01Var95 = new f01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(19, n2Var));
        f01 f01Var96 = new f01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(21, n2Var));
        f01Var96.a("tg://settings/appearance/tap-for-next-media");
        f01 f01Var97 = new f01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(22, n2Var));
        f01Var97.a("tg://settings/data/raise-to-listen");
        f01 f01Var98 = new f01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(24, n2Var));
        f01Var98.a("tg://settings/data/raise-to-speak");
        f01 f01Var99 = new f01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(25, n2Var));
        f01Var99.a("tg://settings/data/pause-music");
        f01 f01Var100 = new f01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(26, n2Var));
        f01 f01Var101 = new f01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(27, n2Var));
        f01 f01Var102 = new f01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(28, n2Var));
        f01 f01Var103 = new f01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(29, n2Var));
        final int i69 = 0;
        f01 f01Var104 = new f01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i69) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var104.a("tg://settings/appearance/stickers-and-emoji");
        final int i70 = 1;
        f01 f01Var105 = new f01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i70) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i71 = 3;
        f01 f01Var106 = new f01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i71) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i72 = 5;
        f01 f01Var107 = new f01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i72) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i73 = 6;
        f01 f01Var108 = new f01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i73) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var108.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i74 = 7;
        f01 f01Var109 = new f01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i74) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i75 = 8;
        f01 f01Var110 = new f01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i75) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var110.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i76 = 9;
        f01 f01Var111 = new f01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i76) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i77 = 10;
        f01 f01Var112 = new f01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (i77) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var112.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i78 = 11;
        f01 f01Var113 = new f01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (i78) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var113.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i79 = 12;
        f01 f01Var114 = new f01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (i79) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i80 = 13;
        f01 f01Var115 = new f01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (i80) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i81 = 22;
        f01 f01Var116 = new f01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (i81) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var116.a("tg://settings/folders");
        final int i82 = 3;
        f01 f01Var117 = new f01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (i82) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var117.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            final int i83 = 14;
            f01Var3 = new f01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i83) {
                        case 0:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(360928);
                            break;
                        case 1:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(360928);
                            xb0Var2.V(32);
                            break;
                        case 2:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(360928);
                            xb0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.W(360928);
                            xb0Var4.V(128);
                            break;
                        case 5:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(360928);
                            xb0Var5.V(256);
                            break;
                        case 6:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(360928);
                            xb0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.V(512);
                            break;
                        case 9:
                            xb0 xb0Var8 = new xb0();
                            n2Var.presentFragment(xb0Var8);
                            xb0Var8.V(1024);
                            break;
                        case 10:
                            xb0 xb0Var9 = new xb0();
                            n2Var.presentFragment(xb0Var9);
                            xb0Var9.V(2048);
                            break;
                        case 11:
                            xb0 xb0Var10 = new xb0();
                            n2Var.presentFragment(xb0Var10);
                            int i110 = 0;
                            while (true) {
                                ArrayList arrayList = xb0Var10.f44379s;
                                if (i110 < arrayList.size()) {
                                    if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                        xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                    } else {
                                        i110++;
                                    }
                                }
                                break;
                            }
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                            break;
                        case 17:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                            g2Var.D();
                            n2Var3.showDialog(g2Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(cx0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            f01Var3 = null;
        }
        if (F(currentAccount, 0)) {
            final int i84 = 24;
            f01Var4 = new f01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i84) {
                        case 0:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(360928);
                            break;
                        case 1:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(360928);
                            xb0Var2.V(32);
                            break;
                        case 2:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(360928);
                            xb0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.W(360928);
                            xb0Var4.V(128);
                            break;
                        case 5:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(360928);
                            xb0Var5.V(256);
                            break;
                        case 6:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(360928);
                            xb0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.V(512);
                            break;
                        case 9:
                            xb0 xb0Var8 = new xb0();
                            n2Var.presentFragment(xb0Var8);
                            xb0Var8.V(1024);
                            break;
                        case 10:
                            xb0 xb0Var9 = new xb0();
                            n2Var.presentFragment(xb0Var9);
                            xb0Var9.V(2048);
                            break;
                        case 11:
                            xb0 xb0Var10 = new xb0();
                            n2Var.presentFragment(xb0Var10);
                            int i110 = 0;
                            while (true) {
                                ArrayList arrayList = xb0Var10.f44379s;
                                if (i110 < arrayList.size()) {
                                    if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                        xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                    } else {
                                        i110++;
                                    }
                                }
                                break;
                            }
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                            break;
                        case 17:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                            g2Var.D();
                            n2Var3.showDialog(g2Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(cx0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            f01Var4 = null;
        }
        if (F(currentAccount, 11)) {
            final int i85 = 5;
            f01Var5 = new f01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i85) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i110 = 0;
                            while (true) {
                                if (i110 >= 4) {
                                    i110 = -1;
                                } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                    i110++;
                                }
                            }
                            if (i110 >= 0) {
                                n2Var.presentFragment(new ig0(i110));
                            }
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            n2Var.presentFragment(new z6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new z6());
                            break;
                        default:
                            n2Var.presentFragment(new z6());
                            break;
                    }
                }
            });
        } else {
            f01Var5 = null;
        }
        if (F(currentAccount, 1)) {
            final int i86 = 15;
            f01Var6 = new f01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i86) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i110 = 0;
                            while (true) {
                                if (i110 >= 4) {
                                    i110 = -1;
                                } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                    i110++;
                                }
                            }
                            if (i110 >= 0) {
                                n2Var.presentFragment(new ig0(i110));
                            }
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            n2Var.presentFragment(new z6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new z6());
                            break;
                        default:
                            n2Var.presentFragment(new z6());
                            break;
                    }
                }
            });
        } else {
            f01Var6 = null;
        }
        if (F(currentAccount, 2)) {
            final int i87 = 26;
            f01Var7 = new f01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i87) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 11, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i110 = 0;
                            while (true) {
                                if (i110 >= 4) {
                                    i110 = -1;
                                } else if (UserConfig.getInstance(i110).isClientActivated()) {
                                    i110++;
                                }
                            }
                            if (i110 >= 0) {
                                n2Var.presentFragment(new ig0(i110));
                            }
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 1, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            n2Var.presentFragment(new z6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 2, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new z6());
                            break;
                        default:
                            n2Var.presentFragment(new z6());
                            break;
                    }
                }
            });
        } else {
            f01Var7 = null;
        }
        if (F(currentAccount, 8)) {
            final int i88 = 7;
            f01Var8 = new f01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i88) {
                        case 0:
                            n2Var.presentFragment(new ru(null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 8:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                    }
                }
            });
        } else {
            f01Var8 = null;
        }
        if (F(currentAccount, 3)) {
            final int i89 = 18;
            f01Var9 = new f01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i89) {
                        case 0:
                            n2Var.presentFragment(new ru(null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 8, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 8:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 3, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                    }
                }
            });
        } else {
            f01Var9 = null;
        }
        f01 f01Var118 = F(currentAccount, 4) ? new f01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ci0(12, n2Var)) : null;
        if (F(currentAccount, 5)) {
            final int i90 = 4;
            f01Var10 = new f01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i90) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new g21());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                            g2Var4.D();
                            n2Var5.showDialog(g2Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                            g2Var5.D();
                            n2Var6.showDialog(g2Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                            g2Var6.D();
                            n2Var7.showDialog(g2Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new xb0());
                            break;
                        case 21:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(3);
                            xb0Var2.V(1);
                            break;
                        case 24:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(3);
                            xb0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.V(28700);
                            break;
                        case 27:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(28700);
                            xb0Var5.V(16388);
                            break;
                        case 28:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(28700);
                            xb0Var6.V(8200);
                            break;
                        default:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.W(28700);
                            xb0Var7.V(4112);
                            break;
                    }
                }
            });
        } else {
            f01Var10 = null;
        }
        if (F(currentAccount, 9)) {
            final int i91 = 15;
            f01Var11 = new f01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i91) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new g21());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                            g2Var4.D();
                            n2Var5.showDialog(g2Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                            g2Var5.D();
                            n2Var6.showDialog(g2Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                            g2Var6.D();
                            n2Var7.showDialog(g2Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new xb0());
                            break;
                        case 21:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(3);
                            xb0Var2.V(1);
                            break;
                        case 24:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(3);
                            xb0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.V(28700);
                            break;
                        case 27:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(28700);
                            xb0Var5.V(16388);
                            break;
                        case 28:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(28700);
                            xb0Var6.V(8200);
                            break;
                        default:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.W(28700);
                            xb0Var7.V(4112);
                            break;
                    }
                }
            });
        } else {
            f01Var11 = null;
        }
        if (F(currentAccount, 6)) {
            final int i92 = 16;
            f01Var12 = new f01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i92) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new g21());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                            g2Var4.D();
                            n2Var5.showDialog(g2Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                            g2Var5.D();
                            n2Var6.showDialog(g2Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                            g2Var6.D();
                            n2Var7.showDialog(g2Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new xb0());
                            break;
                        case 21:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(3);
                            xb0Var2.V(1);
                            break;
                        case 24:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(3);
                            xb0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.V(28700);
                            break;
                        case 27:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(28700);
                            xb0Var5.V(16388);
                            break;
                        case 28:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(28700);
                            xb0Var6.V(8200);
                            break;
                        default:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.W(28700);
                            xb0Var7.V(4112);
                            break;
                    }
                }
            });
        } else {
            f01Var12 = null;
        }
        if (F(currentAccount, 7)) {
            final int i93 = 17;
            f01Var13 = new f01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i93) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new g21());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                            g2Var4.D();
                            n2Var5.showDialog(g2Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                            g2Var5.D();
                            n2Var6.showDialog(g2Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                            g2Var6.D();
                            n2Var7.showDialog(g2Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new xb0());
                            break;
                        case 21:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(3);
                            xb0Var2.V(1);
                            break;
                        case 24:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(3);
                            xb0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.V(28700);
                            break;
                        case 27:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(28700);
                            xb0Var5.V(16388);
                            break;
                        case 28:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(28700);
                            xb0Var6.V(8200);
                            break;
                        default:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.W(28700);
                            xb0Var7.V(4112);
                            break;
                    }
                }
            });
        } else {
            f01Var13 = null;
        }
        if (F(currentAccount, 10)) {
            final int i94 = 18;
            f01Var14 = new f01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i94) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new g21());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                            g2Var4.D();
                            n2Var5.showDialog(g2Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                            g2Var5.D();
                            n2Var6.showDialog(g2Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                            g2Var6.D();
                            n2Var7.showDialog(g2Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new xb0());
                            break;
                        case 21:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(3);
                            xb0Var2.V(1);
                            break;
                        case 24:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(3);
                            xb0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.V(28700);
                            break;
                        case 27:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(28700);
                            xb0Var5.V(16388);
                            break;
                        case 28:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(28700);
                            xb0Var6.V(8200);
                            break;
                        default:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.W(28700);
                            xb0Var7.V(4112);
                            break;
                    }
                }
            });
        } else {
            f01Var14 = null;
        }
        if (F(currentAccount, 12)) {
            final int i95 = 19;
            f01Var15 = new f01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (i95) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                            g2Var.D();
                            n2Var2.showDialog(g2Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new g21());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                            g2Var2.D();
                            n2Var3.showDialog(g2Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                            g2Var3.D();
                            n2Var4.showDialog(g2Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                            g2Var4.D();
                            n2Var5.showDialog(g2Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                            g2Var5.D();
                            n2Var6.showDialog(g2Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                            g2Var6.D();
                            n2Var7.showDialog(g2Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new xb0());
                            break;
                        case 21:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(3);
                            xb0Var2.V(1);
                            break;
                        case 24:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(3);
                            xb0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.V(28700);
                            break;
                        case 27:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(28700);
                            xb0Var5.V(16388);
                            break;
                        case 28:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(28700);
                            xb0Var6.V(8200);
                            break;
                        default:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.W(28700);
                            xb0Var7.V(4112);
                            break;
                    }
                }
            });
        } else {
            f01Var15 = null;
        }
        final int i96 = 20;
        f01 f01Var119 = new f01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i96) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var119.a("tg://settings/power-saving");
        final int i97 = 21;
        f01 f01Var120 = new f01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i97) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var120.a("tg://settings/power-saving/stickers");
        final int i98 = 23;
        f01 f01Var121 = new f01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i98) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i99 = 24;
        f01 f01Var122 = new f01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i99) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i100 = 26;
        f01 f01Var123 = new f01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i100) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        f01Var123.a("tg://settings/power-saving/emoji");
        final int i101 = 27;
        f01 f01Var124 = new f01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i101) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i102 = 28;
        f01 f01Var125 = new f01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i102) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i103 = 29;
        f01 f01Var126 = new f01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i103) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var2, 5, false);
                        g2Var.D();
                        n2Var2.showDialog(g2Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new g21());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var2 = new ag.g2(n2Var3, 9, false);
                        g2Var2.D();
                        n2Var3.showDialog(g2Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        ag.g2 g2Var3 = new ag.g2(n2Var4, 6, false);
                        g2Var3.D();
                        n2Var4.showDialog(g2Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        ag.g2 g2Var4 = new ag.g2(n2Var5, 7, false);
                        g2Var4.D();
                        n2Var5.showDialog(g2Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        ag.g2 g2Var5 = new ag.g2(n2Var6, 10, false);
                        g2Var5.D();
                        n2Var6.showDialog(g2Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        ag.g2 g2Var6 = new ag.g2(n2Var7, 12, false);
                        g2Var6.D();
                        n2Var7.showDialog(g2Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new xb0());
                        break;
                    case 21:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(3);
                        xb0Var2.V(1);
                        break;
                    case 24:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(3);
                        xb0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.V(28700);
                        break;
                    case 27:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(28700);
                        xb0Var5.V(16388);
                        break;
                    case 28:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(28700);
                        xb0Var6.V(8200);
                        break;
                    default:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.W(28700);
                        xb0Var7.V(4112);
                        break;
                }
            }
        });
        final int i104 = 0;
        f01 f01Var127 = new f01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i104) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var127.a("tg://settings/power-saving/effects");
        final int i105 = 1;
        f01 f01Var128 = new f01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i105) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var128.a("tg://settings/power-saving/background");
        final int i106 = 2;
        f01 f01Var129 = new f01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i106) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i107 = 4;
        f01 f01Var130 = new f01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i107) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i108 = 5;
            f01Var16 = new f01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (i108) {
                        case 0:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(360928);
                            break;
                        case 1:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(360928);
                            xb0Var2.V(32);
                            break;
                        case 2:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(360928);
                            xb0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.W(360928);
                            xb0Var4.V(128);
                            break;
                        case 5:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(360928);
                            xb0Var5.V(256);
                            break;
                        case 6:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(360928);
                            xb0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.V(512);
                            break;
                        case 9:
                            xb0 xb0Var8 = new xb0();
                            n2Var.presentFragment(xb0Var8);
                            xb0Var8.V(1024);
                            break;
                        case 10:
                            xb0 xb0Var9 = new xb0();
                            n2Var.presentFragment(xb0Var9);
                            xb0Var9.V(2048);
                            break;
                        case 11:
                            xb0 xb0Var10 = new xb0();
                            n2Var.presentFragment(xb0Var10);
                            int i110 = 0;
                            while (true) {
                                ArrayList arrayList = xb0Var10.f44379s;
                                if (i110 < arrayList.size()) {
                                    if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                        xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                    } else {
                                        i110++;
                                    }
                                }
                                break;
                            }
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                            break;
                        case 17:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                            g2Var.D();
                            n2Var3.showDialog(g2Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(cx0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            f01Var16 = null;
        }
        final int i109 = 6;
        f01 f01Var131 = new f01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i109) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i110, 11), 700, true);
                                } else {
                                    i110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i110 = 8;
        f01 f01Var132 = new f01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i110) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i111 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i111 < arrayList.size()) {
                                if (((rb0) arrayList.get(i111)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i111, 11), 700, true);
                                } else {
                                    i111++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var132.a("tg://settings/power-saving/call-animations");
        final int i111 = 9;
        f01 f01Var133 = new f01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i111) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i112 < arrayList.size()) {
                                if (((rb0) arrayList.get(i112)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i112, 11), 700, true);
                                } else {
                                    i112++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var133.a("tg://settings/power-saving/videos");
        final int i112 = 10;
        f01 f01Var134 = new f01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i112) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i113 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i113 < arrayList.size()) {
                                if (((rb0) arrayList.get(i113)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i113, 11), 700, true);
                                } else {
                                    i113++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var134.a("tg://settings/power-saving/gifs");
        final int i113 = 11;
        f01 f01Var135 = new f01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (i113) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i114 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i114 < arrayList.size()) {
                                if (((rb0) arrayList.get(i114)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i114, 11), 700, true);
                                } else {
                                    i114++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var135.a("tg://settings/power-saving/transitions");
        final int i114 = 12;
        f01 f01Var136 = new f01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (i114) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i115 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i115 < arrayList.size()) {
                                if (((rb0) arrayList.get(i115)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i115, 11), 700, true);
                                } else {
                                    i115++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var136.a("tg://settings/language");
        final int i115 = 13;
        f01 f01Var137 = new f01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (i115) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i116 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i116 < arrayList.size()) {
                                if (((rb0) arrayList.get(i116)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i116, 11), 700, true);
                                } else {
                                    i116++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var137.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i116 = 15;
            f01 f01Var138 = new f01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (i116) {
                        case 0:
                            xb0 xb0Var = new xb0();
                            n2Var.presentFragment(xb0Var);
                            xb0Var.V(360928);
                            break;
                        case 1:
                            xb0 xb0Var2 = new xb0();
                            n2Var.presentFragment(xb0Var2);
                            xb0Var2.W(360928);
                            xb0Var2.V(32);
                            break;
                        case 2:
                            xb0 xb0Var3 = new xb0();
                            n2Var.presentFragment(xb0Var3);
                            xb0Var3.W(360928);
                            xb0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            xb0 xb0Var4 = new xb0();
                            n2Var.presentFragment(xb0Var4);
                            xb0Var4.W(360928);
                            xb0Var4.V(128);
                            break;
                        case 5:
                            xb0 xb0Var5 = new xb0();
                            n2Var.presentFragment(xb0Var5);
                            xb0Var5.W(360928);
                            xb0Var5.V(256);
                            break;
                        case 6:
                            xb0 xb0Var6 = new xb0();
                            n2Var.presentFragment(xb0Var6);
                            xb0Var6.W(360928);
                            xb0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            xb0 xb0Var7 = new xb0();
                            n2Var.presentFragment(xb0Var7);
                            xb0Var7.V(512);
                            break;
                        case 9:
                            xb0 xb0Var8 = new xb0();
                            n2Var.presentFragment(xb0Var8);
                            xb0Var8.V(1024);
                            break;
                        case 10:
                            xb0 xb0Var9 = new xb0();
                            n2Var.presentFragment(xb0Var9);
                            xb0Var9.V(2048);
                            break;
                        case 11:
                            xb0 xb0Var10 = new xb0();
                            n2Var.presentFragment(xb0Var10);
                            int i117 = 0;
                            while (true) {
                                ArrayList arrayList = xb0Var10.f44379s;
                                if (i117 < arrayList.size()) {
                                    if (((rb0) arrayList.get(i117)).f41895f == 1) {
                                        xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i117, 11), 700, true);
                                    } else {
                                        i117++;
                                    }
                                }
                                break;
                            }
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                            break;
                        case 17:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                            g2Var.D();
                            n2Var3.showDialog(g2Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(cx0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            f01Var138.a("tg://settings/language/do-not-translate");
            f01Var37 = f01Var138;
        }
        final int i117 = 16;
        f01 f01Var139 = new f01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (i117) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i118 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i118 < arrayList.size()) {
                                if (((rb0) arrayList.get(i118)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i118, 11), 700, true);
                                } else {
                                    i118++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var139.a("tg://settings/ask-question");
        final int i118 = 17;
        f01 f01Var140 = new f01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (i118) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i119 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i119 < arrayList.size()) {
                                if (((rb0) arrayList.get(i119)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i119, 11), 700, true);
                                } else {
                                    i119++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var140.a("tg://settings/faq");
        final int i119 = 18;
        f01 f01Var141 = new f01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (i119) {
                    case 0:
                        xb0 xb0Var = new xb0();
                        n2Var.presentFragment(xb0Var);
                        xb0Var.V(360928);
                        break;
                    case 1:
                        xb0 xb0Var2 = new xb0();
                        n2Var.presentFragment(xb0Var2);
                        xb0Var2.W(360928);
                        xb0Var2.V(32);
                        break;
                    case 2:
                        xb0 xb0Var3 = new xb0();
                        n2Var.presentFragment(xb0Var3);
                        xb0Var3.W(360928);
                        xb0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        xb0 xb0Var4 = new xb0();
                        n2Var.presentFragment(xb0Var4);
                        xb0Var4.W(360928);
                        xb0Var4.V(128);
                        break;
                    case 5:
                        xb0 xb0Var5 = new xb0();
                        n2Var.presentFragment(xb0Var5);
                        xb0Var5.W(360928);
                        xb0Var5.V(256);
                        break;
                    case 6:
                        xb0 xb0Var6 = new xb0();
                        n2Var.presentFragment(xb0Var6);
                        xb0Var6.W(360928);
                        xb0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        xb0 xb0Var7 = new xb0();
                        n2Var.presentFragment(xb0Var7);
                        xb0Var7.V(512);
                        break;
                    case 9:
                        xb0 xb0Var8 = new xb0();
                        n2Var.presentFragment(xb0Var8);
                        xb0Var8.V(1024);
                        break;
                    case 10:
                        xb0 xb0Var9 = new xb0();
                        n2Var.presentFragment(xb0Var9);
                        xb0Var9.V(2048);
                        break;
                    case 11:
                        xb0 xb0Var10 = new xb0();
                        n2Var.presentFragment(xb0Var10);
                        int i1110 = 0;
                        while (true) {
                            ArrayList arrayList = xb0Var10.f44379s;
                            if (i1110 < arrayList.size()) {
                                if (((rb0) arrayList.get(i1110)).f41895f == 1) {
                                    xb0Var10.f44373b.e1(new cg.p2(xb0Var10, i1110, 11), 700, true);
                                } else {
                                    i1110++;
                                }
                            }
                            break;
                        }
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.y4.U(n2Var2, null));
                        break;
                    case 17:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        we.e.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        ag.g2 g2Var = new ag.g2(n2Var3, 0, false);
                        g2Var.D();
                        n2Var3.showDialog(g2Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(cx0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        f01Var141.a("tg://settings/privacy-policy");
        return new f01[]{f01Var17, f01Var18, f01Var19, f01Var20, f01Var21, f01Var22, f01Var23, f01Var24, f01Var25, f01Var26, f01Var27, f01Var28, f01Var29, f01Var30, f01Var31, f01Var32, f01Var33, f01Var34, f01Var35, f01Var36, f01Var, f01Var38, f01Var39, f01Var40, f01Var41, f01Var42, f01Var43, f01Var44, f01Var45, f01Var46, f01Var47, f01Var2, f01Var48, f01Var49, f01Var50, f01Var51, f01Var52, f01Var53, f01Var54, f01Var55, f01Var56, f01Var57, f01Var58, f01Var59, f01Var60, f01Var61, f01Var62, f01Var63, f01Var64, f01Var65, f01Var66, f01Var67, f01Var68, f01Var69, f01Var70, f01Var71, f01Var72, f01Var73, f01Var74, f01Var75, f01Var76, f01Var77, f01Var78, f01Var79, f01Var80, f01Var81, f01Var82, f01Var83, f01Var84, f01Var85, f01Var86, f01Var87, f01Var88, f01Var89, f01Var90, f01Var91, f01Var92, f01Var93, f01Var94, f01Var95, f01Var96, f01Var97, f01Var98, f01Var99, f01Var100, f01Var101, f01Var102, f01Var103, f01Var104, f01Var105, f01Var106, f01Var107, f01Var108, f01Var109, f01Var110, f01Var111, f01Var112, f01Var113, f01Var114, f01Var115, f01Var116, f01Var117, f01Var3, f01Var4, f01Var5, f01Var6, f01Var7, f01Var8, f01Var9, f01Var118, f01Var10, f01Var11, f01Var12, f01Var13, f01Var14, f01Var15, f01Var119, f01Var120, f01Var121, f01Var122, f01Var123, f01Var124, f01Var125, f01Var126, f01Var127, f01Var128, f01Var129, f01Var130, f01Var16, f01Var131, f01Var132, f01Var133, f01Var134, f01Var135, f01Var136, f01Var137, f01Var37, f01Var139, f01Var140, f01Var141};
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.v;
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf >= 0) {
            arrayList.remove(iIndexOf);
        }
        arrayList.add(0, obj);
        if (!this.f38258w) {
            l();
        }
        if (arrayList.size() > 20) {
            a9.p.s(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof f01) {
                ((f01) obj2).f37896g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f38254f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i10).faqWebPage;
        this.A = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i10).faqSearchArray);
        }
        if (this.A != null || this.B) {
            return;
        }
        this.B = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new n(this, 20));
    }

    public final void I(String str) {
        this.f38260y = str;
        if (this.f38259x != null) {
            Utilities.searchQueue.cancelRunnable(this.f38259x);
            this.f38259x = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            zs0 zs0Var = new zs0(23, this, str);
            this.f38259x = zs0Var;
            dispatchQueue.postRunnable(zs0Var, 300L);
            return;
        }
        this.f38258w = false;
        this.f38256r.clear();
        this.f38257s.clear();
        this.f38255n.clear();
        org.telegram.ui.ActionBar.n2 n2Var = this.f38253e;
        if (n2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) n2Var).L.f29504b.getImageReceiver().startAnimation();
                ((ProfileActivity) this.f38253e).L.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        f01 f01Var;
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            f01[] f01VarArr = this.f38252c;
            if (i10 >= f01VarArr.length) {
                break;
            }
            f01 f01Var2 = f01VarArr[i10];
            if (f01Var2 != null) {
                map.put(Integer.valueOf(f01Var2.f37895f), this.f38252c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.v;
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(it.next()));
                    int int32 = serializedData.readInt32(false);
                    int int33 = serializedData.readInt32(false);
                    if (int33 == 0) {
                        String string = serializedData.readString(false);
                        int int34 = serializedData.readInt32(false);
                        if (int34 > 0) {
                            strArr = new String[int34];
                            for (int i11 = 0; i11 < int34; i11++) {
                                strArr[i11] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(string, strArr, serializedData.readString(false));
                        faqSearchResult.num = int32;
                        arrayList.add(faqSearchResult);
                    } else if (int33 == 1 && (f01Var = (f01) map.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        f01Var.f37896g = int32;
                        arrayList.add(f01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.lp0(this));
    }

    @Override
    public final int h() {
        if (this.f38258w) {
            return this.f38256r.size() + (this.f38257s.isEmpty() ? 0 : this.f38257s.size() + 1);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override
    public final int j(int i10) {
        if (!this.f38258w) {
            ArrayList arrayList = this.v;
            if (i10 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i10 != arrayList.size() + 1) {
                return 0;
            }
        } else if (i10 < this.f38256r.size() || i10 != this.f38256r.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.j4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                return;
            }
        }
        org.telegram.ui.Cells.t6 t6Var = (org.telegram.ui.Cells.t6) view;
        if (this.f38258w) {
            if (i10 >= this.f38256r.size()) {
                int iE = org.telegram.ui.Cells.pa.e(1, i10, this.f38256r);
                t6Var.a((CharSequence) this.f38255n.get(this.f38256r.size() + iE), ((MessagesController.FaqSearchResult) this.f38257s.get(iE)).path, true, iE < this.f38256r.size() - 1);
                return;
            } else {
                f01 f01Var = (f01) this.f38256r.get(i10);
                f01 f01Var2 = i10 > 0 ? (f01) this.f38256r.get(i10 - 1) : null;
                t6Var.b((CharSequence) this.f38255n.get(i10), f01Var.d, (f01Var2 == null || f01Var2.f37894e != f01Var.f37894e) ? f01Var.f37894e : 0, i10 < this.f38256r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int iE2 = org.telegram.ui.Cells.pa.e(1, i10, arrayList);
            MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) this.d.get(iE2);
            t6Var.a(faqSearchResult.title, faqSearchResult.path, true, iE2 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof f01) {
            f01 f01Var3 = (f01) obj;
            t6Var.a(f01Var3.f37891a, f01Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            t6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View t6Var;
        Context context = this.h;
        if (i10 != 0) {
            t6Var = i10 != 1 ? new org.telegram.ui.Cells.j4(context, 16) : new org.telegram.ui.Cells.s3(context, null);
        } else {
            t6Var = new org.telegram.ui.Cells.t6(context);
        }
        t6Var.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(t6Var);
    }
}
