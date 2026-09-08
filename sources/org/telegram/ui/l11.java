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
public class l11 extends org.telegram.ui.Components.kl0 {
    public TLRPC.WebPage E;
    public boolean F;
    public k11[] f38192c;
    public final org.telegram.ui.ActionBar.n2 f38193e;
    public final int f38194f;
    public final Context h;
    public boolean f38198w;
    public rx0 f38199x;
    public String f38200y;
    public final ArrayList d = new ArrayList();
    public ArrayList f38195n = new ArrayList();
    public ArrayList f38196r = new ArrayList();
    public ArrayList f38197s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public l11(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f38193e = n2Var;
        this.f38194f = n2Var.getCurrentAccount();
        this.h = context;
        this.f38192c = H(n2Var);
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

    public static k11[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        k11 k11Var;
        k11 k11Var2;
        k11 k11Var3;
        k11 k11Var4;
        k11 k11Var5;
        k11 k11Var6;
        k11 k11Var7;
        k11 k11Var8;
        k11 k11Var9;
        k11 k11Var10;
        k11 k11Var11;
        k11 k11Var12;
        k11 k11Var13;
        k11 k11Var14;
        k11 k11Var15;
        k11 k11Var16;
        k11 k11Var17;
        k11 k11Var18;
        k11 k11Var19;
        k11 k11Var20;
        k11 k11Var21;
        k11 k11Var22;
        final int currentAccount = n2Var.getCurrentAccount();
        k11 k11Var23 = new k11(LocaleController.getString(R.string.EditName), 500, 0, new rx0(16, n2Var, n2Var.getResourceProvider()));
        k11 k11Var24 = new k11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var24.a("tg://settings/edit/change-number");
        k11 k11Var25 = new k11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var25.a("tg://settings/edit/add-account");
        k11 k11Var26 = new k11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var26.a("tg://settings/notifications");
        k11 k11Var27 = new k11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11Var27.a("tg://settings/notifications/private-chats");
        k11 k11Var28 = new k11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11Var28.a("tg://settings/notifications/groups");
        k11 k11Var29 = new k11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(8, n2Var));
        k11Var29.a("tg://settings/notifications/channels");
        k11 k11Var30 = new k11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(20, n2Var));
        k11 k11Var31 = new k11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var32 = new k11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var33 = new k11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(23, n2Var));
        k11Var33.a("tg://settings/notifications/new-contacts");
        k11 k11Var34 = new k11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var34.a("tg://settings/notifications/pinned-messages");
        k11 k11Var35 = new k11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var35.a("tg://settings/notifications/reset");
        k11 k11Var36 = new k11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11 k11Var37 = new k11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11 k11Var38 = new k11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11 k11Var39 = new k11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var39.a("tg://settings/privacy");
        k11 k11Var40 = new k11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var40.a("tg://settings/privacy/2sv");
        k11 k11Var41 = new k11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new q4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new di.ec(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.f32903b.setText(spannableStringBuilder);
                            ybVar.f32903b.setSingleLine(false);
                            ybVar.f32903b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        k11Var41.a("tg://settings/privacy/auto-delete");
        k11 k11Var42 = new k11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var42.a("tg://settings/privacy/passcode");
        k11 k11Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            k11Var = k11Var40;
            k11Var2 = new k11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f38950s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                        nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            return;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            return;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            k11Var2.a("tg://settings/privacy/login-email");
        } else {
            k11Var = k11Var40;
            k11Var2 = null;
        }
        k11 k11Var44 = new k11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var44.a("tg://settings/privacy/blocked");
        k11 k11Var45 = new k11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var45.a("tg://settings/devices");
        k11 k11Var46 = new k11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var46.a("tg://settings/privacy/phone-number/");
        k11 k11Var47 = new k11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var47.a("tg://settings/privacy/last-seen");
        k11 k11Var48 = new k11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var48.a("tg://settings/privacy/profile-photos");
        k11 k11Var49 = new k11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var49.a("tg://settings/privacy/forwards");
        k11 k11Var50 = new k11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var50.a("tg://settings/privacy/calls/p2p");
        k11 k11Var51 = new k11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var51.a("tg://settings/privacy/calls");
        k11 k11Var52 = new k11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var52.a("tg://settings/privacy/invites");
        k11 k11Var53 = new k11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new q4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new di.ec(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.f32903b.setText(spannableStringBuilder);
                            ybVar.f32903b.setSingleLine(false);
                            ybVar.f32903b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        k11Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            k11Var3 = new k11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                n2Var.presentFragment(new wg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            n2Var.presentFragment(new z6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 27:
                            n2Var.presentFragment(new z6());
                            return;
                        case 28:
                            n2Var.presentFragment(new z6());
                            return;
                        default:
                            n2Var.presentFragment(new z6());
                            return;
                    }
                }
            });
            k11Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            k11Var3 = null;
        }
        k11 k11Var54 = new k11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var54.a("tg://settings/privacy/self-destruct");
        k11 k11Var55 = new k11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        k11 k11Var56 = new k11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var56.a("tg://settings/privacy/active-websites");
        k11 k11Var57 = new k11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var57.a("tg://settings/privacy/data-settings/delete-synced");
        k11 k11Var58 = new k11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        k11 k11Var59 = new k11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        k11 k11Var60 = new k11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var60.a("tg://settings/privacy/data-settings/map-provider");
        k11 k11Var61 = new k11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var61.a("tg://settings/privacy/data-settings/link-previews");
        k11 k11Var62 = new k11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var62.a("tg://settings/devices");
        k11 k11Var63 = new k11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var63.a("tg://settings/devices/terminate-sessions");
        k11 k11Var64 = new k11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var64.a("tg://settings/devices/link-desktop");
        k11 k11Var65 = new k11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var65.a("tg://settings/privacy/data-settings");
        k11 k11Var66 = new k11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11 k11Var67 = new k11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11Var67.a("tg://settings/data/storage");
        k11 k11Var68 = new k11(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11 k11Var69 = new k11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11 k11Var70 = new k11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new wg0(i10));
                            return;
                        }
                        return;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        n2Var.presentFragment(new z6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 27:
                        n2Var.presentFragment(new z6());
                        return;
                    case 28:
                        n2Var.presentFragment(new z6());
                        return;
                    default:
                        n2Var.presentFragment(new z6());
                        return;
                }
            }
        });
        k11 k11Var71 = new k11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11Var71.a("tg://settings/data/usage");
        k11 k11Var72 = new k11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var73 = new k11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var74 = new k11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var75 = new k11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var76 = new k11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11Var76.a("tg://settings/data/auto-download/reset");
        k11 k11Var77 = new k11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var78 = new k11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var79 = new k11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var80 = new k11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11Var80.a("tg://settings/data/use-less-data");
        k11 k11Var81 = new k11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var82 = new k11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11Var82.a("tg://settings/data/proxy");
        k11 k11Var83 = new k11(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11Var83.a("tg://settings/data/proxy/use-for-calls");
        k11 k11Var84 = new k11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        k11 k11Var85 = new k11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                        return;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
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
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                }
            }
        });
        k11 k11Var86 = new k11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(2, n2Var));
        k11Var86.a("tg://settings/data/save-to-photos/chats");
        k11 k11Var87 = new k11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(3, n2Var));
        k11Var87.a("tg://settings/data/save-to-photos/groups");
        k11 k11Var88 = new k11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(4, n2Var));
        k11Var88.a("tg://settings/data/save-to-photos/channels");
        k11 k11Var89 = new k11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ri0(5, n2Var));
        k11Var89.a("tg://settings/appearance/themes");
        k11 k11Var90 = new k11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(6, n2Var));
        k11Var90.a("tg://settings/appearance/text-size");
        k11 k11Var91 = new k11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(7, n2Var));
        k11Var91.a("tg://settings/appearance/wallpapers");
        k11 k11Var92 = new k11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(9, n2Var));
        k11 k11Var93 = new k11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(10, n2Var));
        k11 k11Var94 = new k11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(11, n2Var));
        k11 k11Var95 = new k11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(13, n2Var));
        k11 k11Var96 = new k11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ri0(14, n2Var));
        k11Var96.a("tg://settings/appearance/themes/create");
        k11 k11Var97 = new k11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(15, n2Var));
        k11Var97.a("tg://settings/appearance/message-corners");
        k11 k11Var98 = new k11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(16, n2Var));
        k11 k11Var99 = new k11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(17, n2Var));
        k11 k11Var100 = new k11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(18, n2Var));
        k11Var100.a("tg://settings/appearance/app-icon");
        k11 k11Var101 = new k11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(19, n2Var));
        k11 k11Var102 = new k11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(21, n2Var));
        k11Var102.a("tg://settings/appearance/tap-for-next-media");
        k11 k11Var103 = new k11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(22, n2Var));
        k11Var103.a("tg://settings/data/raise-to-listen");
        k11 k11Var104 = new k11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(24, n2Var));
        k11Var104.a("tg://settings/data/raise-to-speak");
        k11 k11Var105 = new k11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(25, n2Var));
        k11Var105.a("tg://settings/data/pause-music");
        k11 k11Var106 = new k11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(26, n2Var));
        k11 k11Var107 = new k11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(27, n2Var));
        k11 k11Var108 = new k11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(28, n2Var));
        k11 k11Var109 = new k11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(29, n2Var));
        k11 k11Var110 = new k11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var110.a("tg://settings/appearance/stickers-and-emoji");
        k11 k11Var111 = new k11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var112 = new k11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var113 = new k11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var114 = new k11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        k11 k11Var115 = new k11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var116 = new k11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        k11 k11Var117 = new k11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var118 = new k11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        k11 k11Var119 = new k11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        k11 k11Var120 = new k11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var121 = new k11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        k11 k11Var122 = new k11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var122.a("tg://settings/folders");
        k11 k11Var123 = new k11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            k11Var4 = k11Var123;
            k11Var5 = k11Var114;
            k11Var6 = k11Var116;
            k11Var7 = k11Var118;
            k11Var8 = new k11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f38950s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                        nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            return;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            return;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            k11Var4 = k11Var123;
            k11Var5 = k11Var114;
            k11Var6 = k11Var116;
            k11Var7 = k11Var118;
            k11Var8 = null;
        }
        if (F(currentAccount, 0)) {
            k11Var9 = new k11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f38950s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                        nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            return;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            return;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            k11Var9 = null;
        }
        if (F(currentAccount, 11)) {
            k11Var10 = new k11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                n2Var.presentFragment(new wg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            n2Var.presentFragment(new z6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 27:
                            n2Var.presentFragment(new z6());
                            return;
                        case 28:
                            n2Var.presentFragment(new z6());
                            return;
                        default:
                            n2Var.presentFragment(new z6());
                            return;
                    }
                }
            });
        } else {
            k11Var10 = null;
        }
        if (F(currentAccount, 1)) {
            k11Var11 = new k11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                n2Var.presentFragment(new wg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            n2Var.presentFragment(new z6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 27:
                            n2Var.presentFragment(new z6());
                            return;
                        case 28:
                            n2Var.presentFragment(new z6());
                            return;
                        default:
                            n2Var.presentFragment(new z6());
                            return;
                    }
                }
            });
        } else {
            k11Var11 = null;
        }
        if (F(currentAccount, 2)) {
            k11Var12 = new k11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                n2Var.presentFragment(new wg0(i10));
                                return;
                            }
                            return;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            n2Var.presentFragment(new z6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 27:
                            n2Var.presentFragment(new z6());
                            return;
                        case 28:
                            n2Var.presentFragment(new z6());
                            return;
                        default:
                            n2Var.presentFragment(new z6());
                            return;
                    }
                }
            });
        } else {
            k11Var12 = null;
        }
        if (F(currentAccount, 8)) {
            k11Var13 = new k11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                            return;
                        case 1:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 4:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 5:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 6:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 7:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
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
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 14:
                            n2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 15:
                            n2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                    }
                }
            });
        } else {
            k11Var13 = null;
        }
        if (F(currentAccount, 3)) {
            k11Var14 = new k11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                            return;
                        case 1:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                        case 2:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 4:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 5:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 6:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 7:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
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
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 12:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 14:
                            n2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 15:
                            n2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 17:
                            n2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                    }
                }
            });
        } else {
            k11Var14 = null;
        }
        if (F(currentAccount, 4)) {
            k11Var15 = new k11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ri0(12, n2Var));
        } else {
            k11Var15 = null;
        }
        if (F(currentAccount, 5)) {
            k11Var16 = new k11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            n2Var.presentFragment(new n31());
                            return;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            k11Var16 = null;
        }
        if (F(currentAccount, 9)) {
            k11Var17 = new k11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            n2Var.presentFragment(new n31());
                            return;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            k11Var17 = null;
        }
        if (F(currentAccount, 6)) {
            k11Var18 = new k11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            n2Var.presentFragment(new n31());
                            return;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            k11Var18 = null;
        }
        if (F(currentAccount, 7)) {
            k11Var19 = new k11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            n2Var.presentFragment(new n31());
                            return;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            k11Var19 = null;
        }
        if (F(currentAccount, 10)) {
            k11Var20 = new k11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            n2Var.presentFragment(new n31());
                            return;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            k11Var20 = null;
        }
        if (F(currentAccount, 12)) {
            k11Var21 = new k11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            return;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            n2Var.presentFragment(new n31());
                            return;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            return;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            return;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            return;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            return;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            return;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(28700);
                            return;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(28700);
                            nc0Var5.V(16388);
                            return;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(28700);
                            nc0Var6.V(8200);
                            return;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(28700);
                            nc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            k11Var21 = null;
        }
        k11 k11Var124 = new k11(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var124.a("tg://settings/power-saving");
        k11 k11Var125 = new k11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var125.a("tg://settings/power-saving/stickers");
        k11 k11Var126 = new k11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var127 = new k11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var128 = new k11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11Var128.a("tg://settings/power-saving/emoji");
        k11 k11Var129 = new k11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var130 = new k11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var131 = new k11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        return;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        n2Var.presentFragment(new n31());
                        return;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        return;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        return;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        return;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        return;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        return;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(28700);
                        return;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(28700);
                        nc0Var5.V(16388);
                        return;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(28700);
                        nc0Var6.V(8200);
                        return;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(28700);
                        nc0Var7.V(4112);
                        return;
                }
            }
        });
        k11 k11Var132 = new k11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var132.a("tg://settings/power-saving/effects");
        k11 k11Var133 = new k11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var133.a("tg://settings/power-saving/background");
        k11 k11Var134 = new k11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11 k11Var135 = new k11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            k11Var22 = new k11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f38950s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                        nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            return;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            return;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            k11Var22 = null;
        }
        k11 k11Var136 = new k11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11 k11Var137 = new k11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var137.a("tg://settings/power-saving/call-animations");
        k11 k11Var138 = new k11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var138.a("tg://settings/power-saving/videos");
        k11 k11Var139 = new k11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var139.a("tg://settings/power-saving/gifs");
        k11 k11Var140 = new k11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var140.a("tg://settings/power-saving/transitions");
        k11 k11Var141 = new k11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var141.a("tg://settings/language");
        k11 k11Var142 = new k11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            k11 k11Var143 = new k11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(360928);
                            return;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(360928);
                            nc0Var2.V(32);
                            return;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(360928);
                            nc0Var3.V(64);
                            return;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(360928);
                            nc0Var4.V(128);
                            return;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(360928);
                            nc0Var5.V(256);
                            return;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(360928);
                            nc0Var6.V(32768);
                            return;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            return;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            return;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            return;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.f38950s;
                                if (i10 < arrayList.size()) {
                                    if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                        nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            return;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            return;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            return;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            k11Var143.a("tg://settings/language/do-not-translate");
            k11Var43 = k11Var143;
        }
        k11 k11Var144 = new k11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var144.a("tg://settings/ask-question");
        k11 k11Var145 = new k11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var145.a("tg://settings/faq");
        k11 k11Var146 = new k11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(360928);
                        return;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(360928);
                        nc0Var2.V(32);
                        return;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(360928);
                        nc0Var3.V(64);
                        return;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(360928);
                        nc0Var4.V(128);
                        return;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(360928);
                        nc0Var5.V(256);
                        return;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(360928);
                        nc0Var6.V(32768);
                        return;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        return;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        return;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        return;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.f38950s;
                            if (i10 < arrayList.size()) {
                                if (((hc0) arrayList.get(i10)).f36978f == 1) {
                                    nc0Var10.f38944b.d1(new i2.t(nc0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        return;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        return;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        return;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        k11Var146.a("tg://settings/privacy-policy");
        return new k11[]{k11Var23, k11Var24, k11Var25, k11Var26, k11Var27, k11Var28, k11Var29, k11Var30, k11Var31, k11Var32, k11Var33, k11Var34, k11Var35, k11Var36, k11Var37, k11Var38, k11Var39, k11Var, k11Var41, k11Var42, k11Var2, k11Var44, k11Var45, k11Var46, k11Var47, k11Var48, k11Var49, k11Var50, k11Var51, k11Var52, k11Var53, k11Var3, k11Var54, k11Var55, k11Var56, k11Var57, k11Var58, k11Var59, k11Var60, k11Var61, k11Var62, k11Var63, k11Var64, k11Var65, k11Var66, k11Var67, k11Var68, k11Var69, k11Var70, k11Var71, k11Var72, k11Var73, k11Var74, k11Var75, k11Var76, k11Var77, k11Var78, k11Var79, k11Var80, k11Var81, k11Var82, k11Var83, k11Var84, k11Var85, k11Var86, k11Var87, k11Var88, k11Var89, k11Var90, k11Var91, k11Var92, k11Var93, k11Var94, k11Var95, k11Var96, k11Var97, k11Var98, k11Var99, k11Var100, k11Var101, k11Var102, k11Var103, k11Var104, k11Var105, k11Var106, k11Var107, k11Var108, k11Var109, k11Var110, k11Var111, k11Var112, k11Var113, k11Var5, k11Var115, k11Var6, k11Var117, k11Var7, k11Var119, k11Var120, k11Var121, k11Var122, k11Var4, k11Var8, k11Var9, k11Var10, k11Var11, k11Var12, k11Var13, k11Var14, k11Var15, k11Var16, k11Var17, k11Var18, k11Var19, k11Var20, k11Var21, k11Var124, k11Var125, k11Var126, k11Var127, k11Var128, k11Var129, k11Var130, k11Var131, k11Var132, k11Var133, k11Var134, k11Var135, k11Var22, k11Var136, k11Var137, k11Var138, k11Var139, k11Var140, k11Var141, k11Var142, k11Var43, k11Var144, k11Var145, k11Var146};
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45770f == 0) {
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
        if (!this.f38198w) {
            l();
        }
        if (arrayList.size() > 20) {
            a4.a.x(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof k11) {
                ((k11) obj2).f37920g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f38194f;
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
        this.f38200y = str;
        if (this.f38199x != null) {
            Utilities.searchQueue.cancelRunnable(this.f38199x);
            this.f38199x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f38198w = false;
            this.f38196r.clear();
            this.f38197s.clear();
            this.f38195n.clear();
            org.telegram.ui.ActionBar.n2 n2Var = this.f38193e;
            if (n2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) n2Var).P.f32780b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.f38193e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        rx0 rx0Var = new rx0(17, this, str);
        this.f38199x = rx0Var;
        dispatchQueue.postRunnable(rx0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        k11 k11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            k11[] k11VarArr = this.f38192c;
            if (i10 >= k11VarArr.length) {
                break;
            }
            k11 k11Var2 = k11VarArr[i10];
            if (k11Var2 != null) {
                hashMap.put(Integer.valueOf(k11Var2.f37919f), this.f38192c[i10]);
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
                    } else if (readInt322 == 1 && (k11Var = (k11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        k11Var.f37920g = readInt32;
                        arrayList.add(k11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new f11(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f38198w) {
            int size2 = this.f38196r.size();
            if (!this.f38197s.isEmpty()) {
                i10 = this.f38197s.size() + 1;
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
        if (this.f38198w) {
            if (i10 < this.f38196r.size() || i10 != this.f38196r.size()) {
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
        k11 k11Var;
        int i11;
        int i12 = c1Var.f45770f;
        View view = c1Var.f45766a;
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
        org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
        boolean z11 = false;
        if (this.f38198w) {
            if (i10 < this.f38196r.size()) {
                k11 k11Var2 = (k11) this.f38196r.get(i10);
                if (i10 > 0) {
                    k11Var = (k11) this.f38196r.get(i10 - 1);
                } else {
                    k11Var = null;
                }
                if (k11Var != null && k11Var.f37918e == k11Var2.f37918e) {
                    i11 = 0;
                } else {
                    i11 = k11Var2.f37918e;
                }
                CharSequence charSequence = (CharSequence) this.f38195n.get(i10);
                String[] strArr = k11Var2.d;
                if (i10 >= this.f38196r.size() - 1) {
                    z10 = false;
                }
                x6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.f38196r);
            CharSequence charSequence2 = (CharSequence) this.f38195n.get(this.f38196r.size() + f7);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f38197s.get(f7)).path;
            if (f7 < this.f38196r.size() - 1) {
                z11 = true;
            }
            x6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof k11) {
                k11 k11Var3 = (k11) obj;
                String str = k11Var3.f37915a;
                String[] strArr3 = k11Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                x6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i10 < arrayList.size() - 1) {
                    z11 = true;
                }
                x6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int f10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(f10);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (f10 < arrayList.size() - 1) {
            z11 = true;
        }
        x6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View x6Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                x6Var = new org.telegram.ui.Cells.l4(context, 16);
            } else {
                x6Var = new org.telegram.ui.Cells.u3(context, null);
            }
        } else {
            x6Var = new org.telegram.ui.Cells.x6(context);
        }
        x6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(x6Var);
    }
}
