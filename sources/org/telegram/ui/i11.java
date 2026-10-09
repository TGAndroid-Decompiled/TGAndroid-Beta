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
public class i11 extends org.telegram.ui.Components.pm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public h11[] f38443c;
    public final org.telegram.ui.ActionBar.n2 f38444e;
    public final int f38445f;
    public final Context h;
    public boolean f38449w;
    public rt0 f38450x;
    public String f38451y;
    public final ArrayList d = new ArrayList();
    public ArrayList f38446n = new ArrayList();
    public ArrayList f38447r = new ArrayList();
    public ArrayList f38448s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public i11(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f38444e = n2Var;
        this.f38445f = n2Var.getCurrentAccount();
        this.h = context;
        this.f38443c = H(n2Var);
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

    public static h11[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        h11 h11Var;
        h11 h11Var2;
        h11 h11Var3;
        h11 h11Var4;
        h11 h11Var5;
        h11 h11Var6;
        h11 h11Var7;
        h11 h11Var8;
        h11 h11Var9;
        h11 h11Var10;
        h11 h11Var11;
        h11 h11Var12;
        h11 h11Var13;
        h11 h11Var14;
        h11 h11Var15;
        h11 h11Var16;
        h11 h11Var17;
        h11 h11Var18;
        h11 h11Var19;
        h11 h11Var20;
        h11 h11Var21;
        h11 h11Var22;
        h11 h11Var23;
        final int currentAccount = n2Var.getCurrentAccount();
        h11 h11Var24 = new h11(LocaleController.getString(R.string.EditName), 500, 0, new rt0(24, n2Var, n2Var.getResourceProvider()));
        h11 h11Var25 = new h11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var25.a("tg://settings/edit/change-number");
        h11 h11Var26 = new h11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var26.a("tg://settings/edit/add-account");
        h11 h11Var27 = new h11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var27.a("tg://settings/notifications");
        h11 h11Var28 = new h11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var28.a("tg://settings/notifications/private-chats");
        h11 h11Var29 = new h11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11Var29.a("tg://settings/notifications/groups");
        h11 h11Var30 = new h11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(7, n2Var));
        h11Var30.a("tg://settings/notifications/channels");
        h11 h11Var31 = new h11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(19, n2Var));
        h11 h11Var32 = new h11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var33 = new h11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var34 = new h11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(23, n2Var));
        h11Var34.a("tg://settings/notifications/new-contacts");
        h11 h11Var35 = new h11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var35.a("tg://settings/notifications/pinned-messages");
        h11 h11Var36 = new h11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var36.a("tg://settings/notifications/reset");
        h11 h11Var37 = new h11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var38 = new h11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var39 = new h11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var40 = new h11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var40.a("tg://settings/privacy");
        h11 h11Var41 = new h11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var41.a("tg://settings/privacy/2sv");
        h11 h11Var42 = new h11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(a02.W(), null);
                            bcVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            bcVar.f24967b.setText(spannableStringBuilder);
                            bcVar.f24967b.setSingleLine(false);
                            bcVar.f24967b.setMaxLines(2);
                            a02.b(bcVar, 2750).j();
                            return;
                        }
                        n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        h11Var42.a("tg://settings/privacy/auto-delete");
        h11 h11Var43 = new h11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var43.a("tg://settings/privacy/passcode");
        h11 h11Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            h11Var = h11Var41;
            h11Var2 = new h11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(360928);
                            mc0Var.V(64);
                            return;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(360928);
                            mc0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(360928);
                            mc0Var3.V(256);
                            return;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(360928);
                            mc0Var4.V(32768);
                            return;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            return;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            return;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.f39835s;
                                if (i10 < arrayList.size()) {
                                    if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                        mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            return;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var2.a("tg://settings/privacy/login-email");
        } else {
            h11Var = h11Var41;
            h11Var2 = null;
        }
        h11 h11Var45 = new h11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var45.a("tg://settings/privacy/blocked");
        h11 h11Var46 = new h11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var46.a("tg://settings/devices");
        h11 h11Var47 = new h11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var47.a("tg://settings/privacy/phone-number/");
        h11 h11Var48 = new h11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var48.a("tg://settings/privacy/last-seen");
        h11 h11Var49 = new h11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var49.a("tg://settings/privacy/profile-photos");
        h11 h11Var50 = new h11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var50.a("tg://settings/privacy/forwards");
        h11 h11Var51 = new h11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var51.a("tg://settings/privacy/calls/p2p");
        h11 h11Var52 = new h11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var52.a("tg://settings/privacy/calls");
        h11 h11Var53 = new h11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var53.a("tg://settings/privacy/invites");
        h11 h11Var54 = new h11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(a02.W(), null);
                            bcVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            bcVar.f24967b.setText(spannableStringBuilder);
                            bcVar.f24967b.setSingleLine(false);
                            bcVar.f24967b.setMaxLines(2);
                            a02.b(bcVar, 2750).j();
                            return;
                        }
                        n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        h11Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            h11Var3 = h11Var54;
            h11Var4 = new h11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                            y0Var.E();
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
                                n2Var.presentFragment(new wg0(i10));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                            y0Var2.E();
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
                            n2Var.presentFragment(new y6());
                            return;
                        case 24:
                            n2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new y6());
                            return;
                        case 27:
                            n2Var.presentFragment(new y6());
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
            h11Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            h11Var3 = h11Var54;
            h11Var4 = null;
        }
        h11 h11Var55 = new h11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var55.a("tg://settings/privacy/self-destruct");
        h11 h11Var56 = new h11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        h11 h11Var57 = new h11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var57.a("tg://settings/privacy/active-websites");
        h11 h11Var58 = new h11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var58.a("tg://settings/privacy/data-settings/delete-synced");
        h11 h11Var59 = new h11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        h11 h11Var60 = new h11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        h11 h11Var61 = new h11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var61.a("tg://settings/privacy/data-settings/map-provider");
        h11 h11Var62 = new h11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var62.a("tg://settings/privacy/data-settings/link-previews");
        h11 h11Var63 = new h11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var63.a("tg://settings/devices");
        h11 h11Var64 = new h11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var64.a("tg://settings/devices/terminate-sessions");
        h11 h11Var65 = new h11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var65.a("tg://settings/devices/link-desktop");
        h11 h11Var66 = new h11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var66.a("tg://settings/privacy/data-settings");
        h11 h11Var67 = new h11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11 h11Var68 = new h11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var68.a("tg://settings/data/storage");
        h11 h11Var69 = new h11(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11 h11Var70 = new h11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11 h11Var71 = new h11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11 h11Var72 = new h11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
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
                            n2Var.presentFragment(new wg0(i10));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
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
                        n2Var.presentFragment(new y6());
                        return;
                    case 24:
                        n2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new y6());
                        return;
                    case 27:
                        n2Var.presentFragment(new y6());
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
        h11Var72.a("tg://settings/data/usage");
        h11 h11Var73 = new h11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var74 = new h11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var75 = new h11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var76 = new h11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var77 = new h11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11Var77.a("tg://settings/data/auto-download/reset");
        h11 h11Var78 = new h11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var79 = new h11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var80 = new h11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var81 = new h11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11Var81.a("tg://settings/data/use-less-data");
        h11 h11Var82 = new h11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var83 = new h11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11Var83.a("tg://settings/data/proxy");
        h11 h11Var84 = new h11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        h11 h11Var85 = new h11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11 h11Var86 = new h11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11Var86.a("tg://settings/data/save-to-photos/chats");
        h11 h11Var87 = new h11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        h11Var87.a("tg://settings/data/save-to-photos/groups");
        h11 h11Var88 = new h11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new si0(2, n2Var));
        h11Var88.a("tg://settings/data/save-to-photos/channels");
        h11 h11Var89 = new h11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new si0(3, n2Var));
        h11Var89.a("tg://settings/appearance/themes");
        h11 h11Var90 = new h11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(4, n2Var));
        h11Var90.a("tg://settings/appearance/text-size");
        h11 h11Var91 = new h11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(5, n2Var));
        h11Var91.a("tg://settings/appearance/wallpapers");
        h11 h11Var92 = new h11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new si0(6, n2Var));
        h11 h11Var93 = new h11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new si0(8, n2Var));
        h11 h11Var94 = new h11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(9, n2Var));
        h11 h11Var95 = new h11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(10, n2Var));
        h11 h11Var96 = new h11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new si0(11, n2Var));
        h11Var96.a("tg://settings/appearance/themes/create");
        h11 h11Var97 = new h11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(13, n2Var));
        h11Var97.a("tg://settings/appearance/message-corners");
        h11 h11Var98 = new h11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(14, n2Var));
        h11 h11Var99 = new h11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(15, n2Var));
        h11 h11Var100 = new h11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(16, n2Var));
        h11Var100.a("tg://settings/appearance/app-icon");
        h11 h11Var101 = new h11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(17, n2Var));
        h11 h11Var102 = new h11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(18, n2Var));
        h11Var102.a("tg://settings/appearance/tap-for-next-media");
        h11 h11Var103 = new h11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(20, n2Var));
        h11Var103.a("tg://settings/data/raise-to-listen");
        h11 h11Var104 = new h11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(21, n2Var));
        h11Var104.a("tg://settings/data/raise-to-speak");
        h11 h11Var105 = new h11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(22, n2Var));
        h11Var105.a("tg://settings/data/pause-music");
        h11 h11Var106 = new h11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(24, n2Var));
        h11 h11Var107 = new h11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(25, n2Var));
        h11 h11Var108 = new h11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(26, n2Var));
        h11 h11Var109 = new h11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(27, n2Var));
        h11 h11Var110 = new h11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new si0(28, n2Var));
        h11Var110.a("tg://settings/appearance/stickers-and-emoji");
        h11 h11Var111 = new h11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new si0(29, n2Var));
        h11 h11Var112 = new h11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var113 = new h11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var114 = new h11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        h11 h11Var115 = new h11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var116 = new h11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        h11 h11Var117 = new h11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var118 = new h11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        h11 h11Var119 = new h11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        h11 h11Var120 = new h11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var121 = new h11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        h11 h11Var122 = new h11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var122.a("tg://settings/folders");
        h11 h11Var123 = new h11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            h11Var5 = h11Var123;
            h11Var6 = h11Var114;
            h11Var7 = h11Var116;
            h11Var8 = h11Var118;
            h11Var9 = new h11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(360928);
                            mc0Var.V(64);
                            return;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(360928);
                            mc0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(360928);
                            mc0Var3.V(256);
                            return;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(360928);
                            mc0Var4.V(32768);
                            return;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            return;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            return;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.f39835s;
                                if (i10 < arrayList.size()) {
                                    if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                        mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            return;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var5 = h11Var123;
            h11Var6 = h11Var114;
            h11Var7 = h11Var116;
            h11Var8 = h11Var118;
            h11Var9 = null;
        }
        if (F(currentAccount, 0)) {
            h11Var10 = new h11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(360928);
                            mc0Var.V(64);
                            return;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(360928);
                            mc0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(360928);
                            mc0Var3.V(256);
                            return;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(360928);
                            mc0Var4.V(32768);
                            return;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            return;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            return;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.f39835s;
                                if (i10 < arrayList.size()) {
                                    if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                        mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            return;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var10 = null;
        }
        if (F(currentAccount, 11)) {
            h11Var11 = new h11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(360928);
                            mc0Var.V(64);
                            return;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(360928);
                            mc0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(360928);
                            mc0Var3.V(256);
                            return;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(360928);
                            mc0Var4.V(32768);
                            return;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            return;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            return;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.f39835s;
                                if (i10 < arrayList.size()) {
                                    if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                        mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            return;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var11 = null;
        }
        if (F(currentAccount, 1)) {
            h11Var12 = new h11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                            y0Var.E();
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
                                n2Var.presentFragment(new wg0(i10));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                            y0Var2.E();
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
                            n2Var.presentFragment(new y6());
                            return;
                        case 24:
                            n2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new y6());
                            return;
                        case 27:
                            n2Var.presentFragment(new y6());
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
            h11Var12 = null;
        }
        if (F(currentAccount, 2)) {
            h11Var13 = new h11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                            y0Var.E();
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
                                n2Var.presentFragment(new wg0(i10));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                            y0Var2.E();
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
                            n2Var.presentFragment(new y6());
                            return;
                        case 24:
                            n2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new y6());
                            return;
                        case 27:
                            n2Var.presentFragment(new y6());
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
            h11Var13 = null;
        }
        if (F(currentAccount, 8)) {
            h11Var14 = new h11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                            y0Var.E();
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
                                n2Var.presentFragment(new wg0(i10));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                            y0Var2.E();
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
                            n2Var.presentFragment(new y6());
                            return;
                        case 24:
                            n2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new y6());
                            return;
                        case 27:
                            n2Var.presentFragment(new y6());
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
            h11Var14 = null;
        }
        if (F(currentAccount, 3)) {
            h11Var15 = new h11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                            y0Var.E();
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            h11Var15 = null;
        }
        if (F(currentAccount, 4)) {
            h11Var16 = new h11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                            y0Var.E();
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            h11Var16 = null;
        }
        if (F(currentAccount, 5)) {
            h11Var17 = new h11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new si0(12, n2Var));
        } else {
            h11Var17 = null;
        }
        if (F(currentAccount, 9)) {
            h11Var18 = new h11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            return;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            return;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            return;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(28700);
                            mc0Var5.V(16388);
                            return;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(28700);
                            mc0Var6.V(8200);
                            return;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(28700);
                            mc0Var7.V(4112);
                            return;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(360928);
                            return;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(360928);
                            mc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            h11Var18 = null;
        }
        if (F(currentAccount, 6)) {
            h11Var19 = new h11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            return;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            return;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            return;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(28700);
                            mc0Var5.V(16388);
                            return;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(28700);
                            mc0Var6.V(8200);
                            return;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(28700);
                            mc0Var7.V(4112);
                            return;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(360928);
                            return;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(360928);
                            mc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            h11Var19 = null;
        }
        if (F(currentAccount, 7)) {
            h11Var20 = new h11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            return;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            return;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            return;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(28700);
                            mc0Var5.V(16388);
                            return;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(28700);
                            mc0Var6.V(8200);
                            return;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(28700);
                            mc0Var7.V(4112);
                            return;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(360928);
                            return;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(360928);
                            mc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            h11Var20 = null;
        }
        if (F(currentAccount, 10)) {
            h11Var21 = new h11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            return;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            return;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            return;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(28700);
                            mc0Var5.V(16388);
                            return;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(28700);
                            mc0Var6.V(8200);
                            return;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(28700);
                            mc0Var7.V(4112);
                            return;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(360928);
                            return;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(360928);
                            mc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            h11Var21 = null;
        }
        if (F(currentAccount, 12)) {
            h11Var22 = new h11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            return;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            return;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            return;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(28700);
                            mc0Var5.V(16388);
                            return;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(28700);
                            mc0Var6.V(8200);
                            return;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(28700);
                            mc0Var7.V(4112);
                            return;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(360928);
                            return;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(360928);
                            mc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            h11Var22 = null;
        }
        h11 h11Var124 = new h11(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var124.a("tg://settings/power-saving");
        h11 h11Var125 = new h11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var125.a("tg://settings/power-saving/stickers");
        h11 h11Var126 = new h11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var127 = new h11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var128 = new h11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var128.a("tg://settings/power-saving/emoji");
        h11 h11Var129 = new h11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var130 = new h11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var131 = new h11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11 h11Var132 = new h11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var132.a("tg://settings/power-saving/effects");
        h11 h11Var133 = new h11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        return;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        return;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        return;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(28700);
                        mc0Var5.V(16388);
                        return;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(28700);
                        mc0Var6.V(8200);
                        return;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(28700);
                        mc0Var7.V(4112);
                        return;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(360928);
                        return;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(360928);
                        mc0Var9.V(32);
                        return;
                }
            }
        });
        h11Var133.a("tg://settings/power-saving/background");
        h11 h11Var134 = new h11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var135 = new h11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
            h11Var23 = new h11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(360928);
                            mc0Var.V(64);
                            return;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(360928);
                            mc0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(360928);
                            mc0Var3.V(256);
                            return;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(360928);
                            mc0Var4.V(32768);
                            return;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            return;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            return;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.f39835s;
                                if (i10 < arrayList.size()) {
                                    if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                        mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            return;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var23 = null;
        }
        h11 h11Var136 = new h11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var137 = new h11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var137.a("tg://settings/power-saving/call-animations");
        h11 h11Var138 = new h11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var138.a("tg://settings/power-saving/videos");
        h11 h11Var139 = new h11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var139.a("tg://settings/power-saving/gifs");
        h11 h11Var140 = new h11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var140.a("tg://settings/power-saving/transitions");
        h11 h11Var141 = new h11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var141.a("tg://settings/language");
        h11 h11Var142 = new h11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            h11 h11Var143 = new h11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(360928);
                            mc0Var.V(64);
                            return;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(360928);
                            mc0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(360928);
                            mc0Var3.V(256);
                            return;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(360928);
                            mc0Var4.V(32768);
                            return;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            return;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            return;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.f39835s;
                                if (i10 < arrayList.size()) {
                                    if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                        mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            return;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var143.a("tg://settings/language/do-not-translate");
            h11Var44 = h11Var143;
        }
        h11 h11Var144 = new h11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var144.a("tg://settings/ask-question");
        h11 h11Var145 = new h11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var145.a("tg://settings/faq");
        h11 h11Var146 = new h11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(360928);
                        mc0Var.V(64);
                        return;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(360928);
                        mc0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(360928);
                        mc0Var3.V(256);
                        return;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(360928);
                        mc0Var4.V(32768);
                        return;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        return;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        return;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.f39835s;
                            if (i10 < arrayList.size()) {
                                if (((gc0) arrayList.get(i10)).f37977f == 1) {
                                    mc0Var8.f39829b.e1(new i2.s(mc0Var8, i10, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        return;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var146.a("tg://settings/privacy-policy");
        return new h11[]{h11Var24, h11Var25, h11Var26, h11Var27, h11Var28, h11Var29, h11Var30, h11Var31, h11Var32, h11Var33, h11Var34, h11Var35, h11Var36, h11Var37, h11Var38, h11Var39, h11Var40, h11Var, h11Var42, h11Var43, h11Var2, h11Var45, h11Var46, h11Var47, h11Var48, h11Var49, h11Var50, h11Var51, h11Var52, h11Var53, h11Var3, h11Var4, h11Var55, h11Var56, h11Var57, h11Var58, h11Var59, h11Var60, h11Var61, h11Var62, h11Var63, h11Var64, h11Var65, h11Var66, h11Var67, h11Var68, h11Var69, h11Var70, h11Var71, h11Var72, h11Var73, h11Var74, h11Var75, h11Var76, h11Var77, h11Var78, h11Var79, h11Var80, h11Var81, h11Var82, h11Var83, h11Var84, h11Var85, h11Var86, h11Var87, h11Var88, h11Var89, h11Var90, h11Var91, h11Var92, h11Var93, h11Var94, h11Var95, h11Var96, h11Var97, h11Var98, h11Var99, h11Var100, h11Var101, h11Var102, h11Var103, h11Var104, h11Var105, h11Var106, h11Var107, h11Var108, h11Var109, h11Var110, h11Var111, h11Var112, h11Var113, h11Var6, h11Var115, h11Var7, h11Var117, h11Var8, h11Var119, h11Var120, h11Var121, h11Var122, h11Var5, h11Var9, h11Var10, h11Var11, h11Var12, h11Var13, h11Var14, h11Var15, h11Var16, h11Var17, h11Var18, h11Var19, h11Var20, h11Var21, h11Var22, h11Var124, h11Var125, h11Var126, h11Var127, h11Var128, h11Var129, h11Var130, h11Var131, h11Var132, h11Var133, h11Var134, h11Var135, h11Var23, h11Var136, h11Var137, h11Var138, h11Var139, h11Var140, h11Var141, h11Var142, h11Var44, h11Var144, h11Var145, h11Var146};
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f == 0) {
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
        if (!this.f38449w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof h11) {
                ((h11) obj2).f38195g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f38445f;
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
        this.f38451y = str;
        if (this.f38450x != null) {
            Utilities.searchQueue.cancelRunnable(this.f38450x);
            this.f38450x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f38449w = false;
            this.f38447r.clear();
            this.f38448s.clear();
            this.f38446n.clear();
            org.telegram.ui.ActionBar.n2 n2Var = this.f38444e;
            if (n2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) n2Var).P.f24800b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.f38444e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        rt0 rt0Var = new rt0(25, this, str);
        this.f38450x = rt0Var;
        dispatchQueue.postRunnable(rt0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        h11 h11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            h11[] h11VarArr = this.f38443c;
            if (i10 >= h11VarArr.length) {
                break;
            }
            h11 h11Var2 = h11VarArr[i10];
            if (h11Var2 != null) {
                hashMap.put(Integer.valueOf(h11Var2.f38194f), this.f38443c[i10]);
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
                    } else if (readInt322 == 1 && (h11Var = (h11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        h11Var.f38195g = readInt32;
                        arrayList.add(h11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new gf(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f38449w) {
            int size2 = this.f38447r.size();
            if (!this.f38448s.isEmpty()) {
                i10 = this.f38448s.size() + 1;
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
        if (this.f38449w) {
            if (i10 < this.f38447r.size() || i10 != this.f38447r.size()) {
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
    public final void v(s4.d1 d1Var, int i10) {
        h11 h11Var;
        int i11;
        int i12 = d1Var.f47662f;
        View view = d1Var.f47658a;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
            return;
        }
        org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
        boolean z11 = false;
        if (this.f38449w) {
            if (i10 < this.f38447r.size()) {
                h11 h11Var2 = (h11) this.f38447r.get(i10);
                if (i10 > 0) {
                    h11Var = (h11) this.f38447r.get(i10 - 1);
                } else {
                    h11Var = null;
                }
                if (h11Var != null && h11Var.f38193e == h11Var2.f38193e) {
                    i11 = 0;
                } else {
                    i11 = h11Var2.f38193e;
                }
                CharSequence charSequence = (CharSequence) this.f38446n.get(i10);
                String[] strArr = h11Var2.d;
                if (i10 >= this.f38447r.size() - 1) {
                    z10 = false;
                }
                y6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.f38447r);
            CharSequence charSequence2 = (CharSequence) this.f38446n.get(this.f38447r.size() + f7);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f38448s.get(f7)).path;
            if (f7 < this.f38447r.size() - 1) {
                z11 = true;
            }
            y6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof h11) {
                h11 h11Var3 = (h11) obj;
                String str = h11Var3.f38190a;
                String[] strArr3 = h11Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                y6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i10 < arrayList.size() - 1) {
                    z11 = true;
                }
                y6Var.a(str2, strArr4, true, z11);
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
        y6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View y6Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                y6Var = new org.telegram.ui.Cells.m4(context, 16);
            } else {
                y6Var = new org.telegram.ui.Cells.v3(context, null);
            }
        } else {
            y6Var = new org.telegram.ui.Cells.y6(context);
        }
        y6Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(y6Var);
    }
}
