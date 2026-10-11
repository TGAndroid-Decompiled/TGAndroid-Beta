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
public class h11 extends org.telegram.ui.Components.rm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public g11[] f38213c;
    public final org.telegram.ui.ActionBar.m2 f38214e;
    public final int f38215f;
    public final Context h;
    public boolean f38219w;
    public tt0 f38220x;
    public String f38221y;
    public final ArrayList d = new ArrayList();
    public ArrayList f38216n = new ArrayList();
    public ArrayList f38217r = new ArrayList();
    public ArrayList f38218s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public h11(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f38214e = m2Var;
        this.f38215f = m2Var.getCurrentAccount();
        this.h = context;
        this.f38213c = H(m2Var);
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

    public static g11[] H(final org.telegram.ui.ActionBar.m2 m2Var) {
        g11 g11Var;
        g11 g11Var2;
        g11 g11Var3;
        g11 g11Var4;
        g11 g11Var5;
        g11 g11Var6;
        g11 g11Var7;
        g11 g11Var8;
        g11 g11Var9;
        g11 g11Var10;
        g11 g11Var11;
        g11 g11Var12;
        g11 g11Var13;
        g11 g11Var14;
        g11 g11Var15;
        g11 g11Var16;
        g11 g11Var17;
        g11 g11Var18;
        g11 g11Var19;
        g11 g11Var20;
        g11 g11Var21;
        g11 g11Var22;
        g11 g11Var23;
        final int currentAccount = m2Var.getCurrentAccount();
        g11 g11Var24 = new g11(LocaleController.getString(R.string.EditName), 500, 0, new tt0(23, m2Var, m2Var.getResourceProvider()));
        g11 g11Var25 = new g11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var25.a("tg://settings/edit/change-number");
        g11 g11Var26 = new g11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var26.a("tg://settings/edit/add-account");
        g11 g11Var27 = new g11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var27.a("tg://settings/notifications");
        g11 g11Var28 = new g11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var28.a("tg://settings/notifications/private-chats");
        g11 g11Var29 = new g11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11Var29.a("tg://settings/notifications/groups");
        g11 g11Var30 = new g11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(7, m2Var));
        g11Var30.a("tg://settings/notifications/channels");
        g11 g11Var31 = new g11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(19, m2Var));
        g11 g11Var32 = new g11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var33 = new g11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var34 = new g11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(23, m2Var));
        g11Var34.a("tg://settings/notifications/new-contacts");
        g11 g11Var35 = new g11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var35.a("tg://settings/notifications/pinned-messages");
        g11 g11Var36 = new g11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var36.a("tg://settings/notifications/reset");
        g11 g11Var37 = new g11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11 g11Var38 = new g11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11 g11Var39 = new g11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11 g11Var40 = new g11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var40.a("tg://settings/privacy");
        g11 g11Var41 = new g11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var41.a("tg://settings/privacy/2sv");
        g11 g11Var42 = new g11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            m2Var.presentFragment(new o4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(m2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), null);
                            acVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            acVar.f24488b.setText(spannableStringBuilder);
                            acVar.f24488b.setSingleLine(false);
                            acVar.f24488b.setMaxLines(2);
                            a02.b(acVar, 2750).j();
                            return;
                        }
                        m2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        g11Var42.a("tg://settings/privacy/auto-delete");
        g11 g11Var43 = new g11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var43.a("tg://settings/privacy/passcode");
        g11 g11Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            g11Var = g11Var41;
            g11Var2 = new g11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.W(360928);
                            lc0Var.V(64);
                            return;
                        case 1:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(360928);
                            lc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(360928);
                            lc0Var3.V(256);
                            return;
                        case 4:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.W(360928);
                            lc0Var4.V(32768);
                            return;
                        case 5:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.V(1024);
                            return;
                        case 8:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.V(2048);
                            return;
                        case 9:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = lc0Var8.f39589s;
                                if (i10 < arrayList.size()) {
                                    if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                        lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                            y0Var2.E();
                            m2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            fy0 fy0Var = new fy0();
                            fy0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(fy0Var);
                            return;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            g11Var2.a("tg://settings/privacy/login-email");
        } else {
            g11Var = g11Var41;
            g11Var2 = null;
        }
        g11 g11Var45 = new g11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var45.a("tg://settings/privacy/blocked");
        g11 g11Var46 = new g11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var46.a("tg://settings/devices");
        g11 g11Var47 = new g11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var47.a("tg://settings/privacy/phone-number/");
        g11 g11Var48 = new g11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var48.a("tg://settings/privacy/last-seen");
        g11 g11Var49 = new g11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var49.a("tg://settings/privacy/profile-photos");
        g11 g11Var50 = new g11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var50.a("tg://settings/privacy/forwards");
        g11 g11Var51 = new g11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var51.a("tg://settings/privacy/calls/p2p");
        g11 g11Var52 = new g11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var52.a("tg://settings/privacy/calls");
        g11 g11Var53 = new g11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var53.a("tg://settings/privacy/invites");
        g11 g11Var54 = new g11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            m2Var.presentFragment(new o4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(m2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), null);
                            acVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            acVar.f24488b.setText(spannableStringBuilder);
                            acVar.f24488b.setSingleLine(false);
                            acVar.f24488b.setMaxLines(2);
                            a02.b(acVar, 2750).j();
                            return;
                        }
                        m2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        g11Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            g11Var3 = g11Var54;
            g11Var4 = new g11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            m2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            m2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            m2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                m2Var.presentFragment(new vg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            m2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            m2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            m2Var.presentFragment(new x6());
                            return;
                        case 24:
                            m2Var.presentFragment(new x6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new x6());
                            return;
                        case 27:
                            m2Var.presentFragment(new x6());
                            return;
                        case 28:
                            m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                            return;
                        default:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            g11Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            g11Var3 = g11Var54;
            g11Var4 = null;
        }
        g11 g11Var55 = new g11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var55.a("tg://settings/privacy/self-destruct");
        g11 g11Var56 = new g11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        g11 g11Var57 = new g11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var57.a("tg://settings/privacy/active-websites");
        g11 g11Var58 = new g11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var58.a("tg://settings/privacy/data-settings/delete-synced");
        g11 g11Var59 = new g11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        g11 g11Var60 = new g11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        g11 g11Var61 = new g11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var61.a("tg://settings/privacy/data-settings/map-provider");
        g11 g11Var62 = new g11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var62.a("tg://settings/privacy/data-settings/link-previews");
        g11 g11Var63 = new g11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var63.a("tg://settings/devices");
        g11 g11Var64 = new g11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var64.a("tg://settings/devices/terminate-sessions");
        g11 g11Var65 = new g11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var65.a("tg://settings/devices/link-desktop");
        g11 g11Var66 = new g11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var66.a("tg://settings/privacy/data-settings");
        g11 g11Var67 = new g11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11 g11Var68 = new g11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var68.a("tg://settings/data/storage");
        g11 g11Var69 = new g11(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11 g11Var70 = new g11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11 g11Var71 = new g11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11 g11Var72 = new g11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new vg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        m2Var.presentFragment(new x6());
                        return;
                    case 24:
                        m2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new x6());
                        return;
                    case 27:
                        m2Var.presentFragment(new x6());
                        return;
                    case 28:
                        m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                        return;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        g11Var72.a("tg://settings/data/usage");
        g11 g11Var73 = new g11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var74 = new g11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var75 = new g11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var76 = new g11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var77 = new g11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11Var77.a("tg://settings/data/auto-download/reset");
        g11 g11Var78 = new g11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var79 = new g11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var80 = new g11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var81 = new g11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11Var81.a("tg://settings/data/use-less-data");
        g11 g11Var82 = new g11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var83 = new g11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11Var83.a("tg://settings/data/proxy");
        g11 g11Var84 = new g11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        g11 g11Var85 = new g11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11 g11Var86 = new g11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11Var86.a("tg://settings/data/save-to-photos/chats");
        g11 g11Var87 = new g11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        g11Var87.a("tg://settings/data/save-to-photos/groups");
        g11 g11Var88 = new g11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(2, m2Var));
        g11Var88.a("tg://settings/data/save-to-photos/channels");
        g11 g11Var89 = new g11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ri0(3, m2Var));
        g11Var89.a("tg://settings/appearance/themes");
        g11 g11Var90 = new g11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(4, m2Var));
        g11Var90.a("tg://settings/appearance/text-size");
        g11 g11Var91 = new g11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(5, m2Var));
        g11Var91.a("tg://settings/appearance/wallpapers");
        g11 g11Var92 = new g11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(6, m2Var));
        g11 g11Var93 = new g11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(8, m2Var));
        g11 g11Var94 = new g11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(9, m2Var));
        g11 g11Var95 = new g11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(10, m2Var));
        g11 g11Var96 = new g11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ri0(11, m2Var));
        g11Var96.a("tg://settings/appearance/themes/create");
        g11 g11Var97 = new g11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(13, m2Var));
        g11Var97.a("tg://settings/appearance/message-corners");
        g11 g11Var98 = new g11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(14, m2Var));
        g11 g11Var99 = new g11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(15, m2Var));
        g11 g11Var100 = new g11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(16, m2Var));
        g11Var100.a("tg://settings/appearance/app-icon");
        g11 g11Var101 = new g11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(17, m2Var));
        g11 g11Var102 = new g11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(18, m2Var));
        g11Var102.a("tg://settings/appearance/tap-for-next-media");
        g11 g11Var103 = new g11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(20, m2Var));
        g11Var103.a("tg://settings/data/raise-to-listen");
        g11 g11Var104 = new g11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(21, m2Var));
        g11Var104.a("tg://settings/data/raise-to-speak");
        g11 g11Var105 = new g11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(22, m2Var));
        g11Var105.a("tg://settings/data/pause-music");
        g11 g11Var106 = new g11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(24, m2Var));
        g11 g11Var107 = new g11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(25, m2Var));
        g11 g11Var108 = new g11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(26, m2Var));
        g11 g11Var109 = new g11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(27, m2Var));
        g11 g11Var110 = new g11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new ri0(28, m2Var));
        g11Var110.a("tg://settings/appearance/stickers-and-emoji");
        g11 g11Var111 = new g11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new ri0(29, m2Var));
        g11 g11Var112 = new g11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var113 = new g11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var114 = new g11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        g11 g11Var115 = new g11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var116 = new g11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        g11 g11Var117 = new g11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var118 = new g11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        g11 g11Var119 = new g11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        g11 g11Var120 = new g11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var121 = new g11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        g11 g11Var122 = new g11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var122.a("tg://settings/folders");
        g11 g11Var123 = new g11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            g11Var5 = g11Var123;
            g11Var6 = g11Var114;
            g11Var7 = g11Var116;
            g11Var8 = g11Var118;
            g11Var9 = new g11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.W(360928);
                            lc0Var.V(64);
                            return;
                        case 1:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(360928);
                            lc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(360928);
                            lc0Var3.V(256);
                            return;
                        case 4:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.W(360928);
                            lc0Var4.V(32768);
                            return;
                        case 5:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.V(1024);
                            return;
                        case 8:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.V(2048);
                            return;
                        case 9:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = lc0Var8.f39589s;
                                if (i10 < arrayList.size()) {
                                    if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                        lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                            y0Var2.E();
                            m2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            fy0 fy0Var = new fy0();
                            fy0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(fy0Var);
                            return;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            g11Var5 = g11Var123;
            g11Var6 = g11Var114;
            g11Var7 = g11Var116;
            g11Var8 = g11Var118;
            g11Var9 = null;
        }
        if (F(currentAccount, 0)) {
            g11Var10 = new g11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.W(360928);
                            lc0Var.V(64);
                            return;
                        case 1:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(360928);
                            lc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(360928);
                            lc0Var3.V(256);
                            return;
                        case 4:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.W(360928);
                            lc0Var4.V(32768);
                            return;
                        case 5:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.V(1024);
                            return;
                        case 8:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.V(2048);
                            return;
                        case 9:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = lc0Var8.f39589s;
                                if (i10 < arrayList.size()) {
                                    if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                        lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                            y0Var2.E();
                            m2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            fy0 fy0Var = new fy0();
                            fy0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(fy0Var);
                            return;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            g11Var10 = null;
        }
        if (F(currentAccount, 11)) {
            g11Var11 = new g11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.W(360928);
                            lc0Var.V(64);
                            return;
                        case 1:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(360928);
                            lc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(360928);
                            lc0Var3.V(256);
                            return;
                        case 4:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.W(360928);
                            lc0Var4.V(32768);
                            return;
                        case 5:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.V(1024);
                            return;
                        case 8:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.V(2048);
                            return;
                        case 9:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = lc0Var8.f39589s;
                                if (i10 < arrayList.size()) {
                                    if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                        lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                            y0Var2.E();
                            m2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            fy0 fy0Var = new fy0();
                            fy0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(fy0Var);
                            return;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            g11Var11 = null;
        }
        if (F(currentAccount, 1)) {
            g11Var12 = new g11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            m2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            m2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            m2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                m2Var.presentFragment(new vg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            m2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            m2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            m2Var.presentFragment(new x6());
                            return;
                        case 24:
                            m2Var.presentFragment(new x6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new x6());
                            return;
                        case 27:
                            m2Var.presentFragment(new x6());
                            return;
                        case 28:
                            m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                            return;
                        default:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            g11Var12 = null;
        }
        if (F(currentAccount, 2)) {
            g11Var13 = new g11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            m2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            m2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            m2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                m2Var.presentFragment(new vg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            m2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            m2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            m2Var.presentFragment(new x6());
                            return;
                        case 24:
                            m2Var.presentFragment(new x6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new x6());
                            return;
                        case 27:
                            m2Var.presentFragment(new x6());
                            return;
                        case 28:
                            m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                            return;
                        default:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            g11Var13 = null;
        }
        if (F(currentAccount, 8)) {
            g11Var14 = new g11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            m2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            m2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            m2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 1, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                m2Var.presentFragment(new vg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            m2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 2, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            m2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            m2Var.presentFragment(new x6());
                            return;
                        case 24:
                            m2Var.presentFragment(new x6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 8, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new x6());
                            return;
                        case 27:
                            m2Var.presentFragment(new x6());
                            return;
                        case 28:
                            m2Var.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                            return;
                        default:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            g11Var14 = null;
        }
        if (F(currentAccount, 3)) {
            g11Var15 = new g11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            m2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            m2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            m2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            m2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            g11Var15 = null;
        }
        if (F(currentAccount, 4)) {
            g11Var16 = new g11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            m2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            m2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            m2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 3, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            m2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            m2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 4, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            g11Var16 = null;
        }
        if (F(currentAccount, 5)) {
            g11Var17 = new g11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ri0(12, m2Var));
        } else {
            g11Var17 = null;
        }
        if (F(currentAccount, 9)) {
            g11Var18 = new g11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            m2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            m2Var.presentFragment(new k31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new lc0());
                            return;
                        case 19:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.V(3);
                            return;
                        case 20:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(3);
                            lc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(3);
                            lc0Var3.V(2);
                            return;
                        case 23:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.W(28700);
                            lc0Var5.V(16388);
                            return;
                        case 26:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.W(28700);
                            lc0Var6.V(8200);
                            return;
                        case 27:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.W(28700);
                            lc0Var7.V(4112);
                            return;
                        case 28:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            lc0Var8.V(360928);
                            return;
                        default:
                            lc0 lc0Var9 = new lc0();
                            m2Var.presentFragment(lc0Var9);
                            lc0Var9.W(360928);
                            lc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            g11Var18 = null;
        }
        if (F(currentAccount, 6)) {
            g11Var19 = new g11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            m2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            m2Var.presentFragment(new k31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new lc0());
                            return;
                        case 19:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.V(3);
                            return;
                        case 20:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(3);
                            lc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(3);
                            lc0Var3.V(2);
                            return;
                        case 23:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.W(28700);
                            lc0Var5.V(16388);
                            return;
                        case 26:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.W(28700);
                            lc0Var6.V(8200);
                            return;
                        case 27:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.W(28700);
                            lc0Var7.V(4112);
                            return;
                        case 28:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            lc0Var8.V(360928);
                            return;
                        default:
                            lc0 lc0Var9 = new lc0();
                            m2Var.presentFragment(lc0Var9);
                            lc0Var9.W(360928);
                            lc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            g11Var19 = null;
        }
        if (F(currentAccount, 7)) {
            g11Var20 = new g11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            m2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            m2Var.presentFragment(new k31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new lc0());
                            return;
                        case 19:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.V(3);
                            return;
                        case 20:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(3);
                            lc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(3);
                            lc0Var3.V(2);
                            return;
                        case 23:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.W(28700);
                            lc0Var5.V(16388);
                            return;
                        case 26:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.W(28700);
                            lc0Var6.V(8200);
                            return;
                        case 27:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.W(28700);
                            lc0Var7.V(4112);
                            return;
                        case 28:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            lc0Var8.V(360928);
                            return;
                        default:
                            lc0 lc0Var9 = new lc0();
                            m2Var.presentFragment(lc0Var9);
                            lc0Var9.W(360928);
                            lc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            g11Var20 = null;
        }
        if (F(currentAccount, 10)) {
            g11Var21 = new g11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            m2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            m2Var.presentFragment(new k31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new lc0());
                            return;
                        case 19:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.V(3);
                            return;
                        case 20:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(3);
                            lc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(3);
                            lc0Var3.V(2);
                            return;
                        case 23:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.W(28700);
                            lc0Var5.V(16388);
                            return;
                        case 26:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.W(28700);
                            lc0Var6.V(8200);
                            return;
                        case 27:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.W(28700);
                            lc0Var7.V(4112);
                            return;
                        case 28:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            lc0Var8.V(360928);
                            return;
                        default:
                            lc0 lc0Var9 = new lc0();
                            m2Var.presentFragment(lc0Var9);
                            lc0Var9.W(360928);
                            lc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            g11Var21 = null;
        }
        if (F(currentAccount, 12)) {
            g11Var22 = new g11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            m2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new p(1));
                            return;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            m2Var.presentFragment(new k31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new lc0());
                            return;
                        case 19:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.V(3);
                            return;
                        case 20:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(3);
                            lc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(3);
                            lc0Var3.V(2);
                            return;
                        case 23:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.W(28700);
                            lc0Var5.V(16388);
                            return;
                        case 26:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.W(28700);
                            lc0Var6.V(8200);
                            return;
                        case 27:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.W(28700);
                            lc0Var7.V(4112);
                            return;
                        case 28:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            lc0Var8.V(360928);
                            return;
                        default:
                            lc0 lc0Var9 = new lc0();
                            m2Var.presentFragment(lc0Var9);
                            lc0Var9.W(360928);
                            lc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            g11Var22 = null;
        }
        g11 g11Var124 = new g11(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var124.a("tg://settings/power-saving");
        g11 g11Var125 = new g11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var125.a("tg://settings/power-saving/stickers");
        g11 g11Var126 = new g11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var127 = new g11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var128 = new g11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var128.a("tg://settings/power-saving/emoji");
        g11 g11Var129 = new g11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var130 = new g11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var131 = new g11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11 g11Var132 = new g11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var132.a("tg://settings/power-saving/effects");
        g11 g11Var133 = new g11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        m2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 9, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new p(1));
                        return;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        m2Var.presentFragment(new k31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var3 = new rg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.y0 y0Var4 = new rg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.y0 y0Var5 = new rg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new lc0());
                        return;
                    case 19:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.V(3);
                        return;
                    case 20:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(3);
                        lc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(3);
                        lc0Var3.V(2);
                        return;
                    case 23:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.W(28700);
                        lc0Var5.V(16388);
                        return;
                    case 26:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.W(28700);
                        lc0Var6.V(8200);
                        return;
                    case 27:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.W(28700);
                        lc0Var7.V(4112);
                        return;
                    case 28:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        lc0Var8.V(360928);
                        return;
                    default:
                        lc0 lc0Var9 = new lc0();
                        m2Var.presentFragment(lc0Var9);
                        lc0Var9.W(360928);
                        lc0Var9.V(32);
                        return;
                }
            }
        });
        g11Var133.a("tg://settings/power-saving/background");
        g11 g11Var134 = new g11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11 g11Var135 = new g11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            g11Var23 = new g11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.W(360928);
                            lc0Var.V(64);
                            return;
                        case 1:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(360928);
                            lc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(360928);
                            lc0Var3.V(256);
                            return;
                        case 4:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.W(360928);
                            lc0Var4.V(32768);
                            return;
                        case 5:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.V(1024);
                            return;
                        case 8:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.V(2048);
                            return;
                        case 9:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = lc0Var8.f39589s;
                                if (i10 < arrayList.size()) {
                                    if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                        lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                            y0Var2.E();
                            m2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            fy0 fy0Var = new fy0();
                            fy0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(fy0Var);
                            return;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            g11Var23 = null;
        }
        g11 g11Var136 = new g11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11 g11Var137 = new g11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var137.a("tg://settings/power-saving/call-animations");
        g11 g11Var138 = new g11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var138.a("tg://settings/power-saving/videos");
        g11 g11Var139 = new g11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var139.a("tg://settings/power-saving/gifs");
        g11 g11Var140 = new g11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var140.a("tg://settings/power-saving/transitions");
        g11 g11Var141 = new g11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var141.a("tg://settings/language");
        g11 g11Var142 = new g11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            g11 g11Var143 = new g11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            lc0 lc0Var = new lc0();
                            m2Var.presentFragment(lc0Var);
                            lc0Var.W(360928);
                            lc0Var.V(64);
                            return;
                        case 1:
                            lc0 lc0Var2 = new lc0();
                            m2Var.presentFragment(lc0Var2);
                            lc0Var2.W(360928);
                            lc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            lc0 lc0Var3 = new lc0();
                            m2Var.presentFragment(lc0Var3);
                            lc0Var3.W(360928);
                            lc0Var3.V(256);
                            return;
                        case 4:
                            lc0 lc0Var4 = new lc0();
                            m2Var.presentFragment(lc0Var4);
                            lc0Var4.W(360928);
                            lc0Var4.V(32768);
                            return;
                        case 5:
                            lc0 lc0Var5 = new lc0();
                            m2Var.presentFragment(lc0Var5);
                            lc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            lc0 lc0Var6 = new lc0();
                            m2Var.presentFragment(lc0Var6);
                            lc0Var6.V(1024);
                            return;
                        case 8:
                            lc0 lc0Var7 = new lc0();
                            m2Var.presentFragment(lc0Var7);
                            lc0Var7.V(2048);
                            return;
                        case 9:
                            lc0 lc0Var8 = new lc0();
                            m2Var.presentFragment(lc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = lc0Var8.f39589s;
                                if (i10 < arrayList.size()) {
                                    if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                        lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                            y0Var2.E();
                            m2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            fy0 fy0Var = new fy0();
                            fy0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(fy0Var);
                            return;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            g11Var143.a("tg://settings/language/do-not-translate");
            g11Var44 = g11Var143;
        }
        g11 g11Var144 = new g11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var144.a("tg://settings/ask-question");
        g11 g11Var145 = new g11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var145.a("tg://settings/faq");
        g11 g11Var146 = new g11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        lc0 lc0Var = new lc0();
                        m2Var.presentFragment(lc0Var);
                        lc0Var.W(360928);
                        lc0Var.V(64);
                        return;
                    case 1:
                        lc0 lc0Var2 = new lc0();
                        m2Var.presentFragment(lc0Var2);
                        lc0Var2.W(360928);
                        lc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        lc0 lc0Var3 = new lc0();
                        m2Var.presentFragment(lc0Var3);
                        lc0Var3.W(360928);
                        lc0Var3.V(256);
                        return;
                    case 4:
                        lc0 lc0Var4 = new lc0();
                        m2Var.presentFragment(lc0Var4);
                        lc0Var4.W(360928);
                        lc0Var4.V(32768);
                        return;
                    case 5:
                        lc0 lc0Var5 = new lc0();
                        m2Var.presentFragment(lc0Var5);
                        lc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        lc0 lc0Var6 = new lc0();
                        m2Var.presentFragment(lc0Var6);
                        lc0Var6.V(1024);
                        return;
                    case 8:
                        lc0 lc0Var7 = new lc0();
                        m2Var.presentFragment(lc0Var7);
                        lc0Var7.V(2048);
                        return;
                    case 9:
                        lc0 lc0Var8 = new lc0();
                        m2Var.presentFragment(lc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = lc0Var8.f39589s;
                            if (i10 < arrayList.size()) {
                                if (((fc0) arrayList.get(i10)).f37639f == 1) {
                                    lc0Var8.f39583b.e1(new i2.s(lc0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.y0 y0Var = new rg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        of.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.y0 y0Var2 = new rg.y0(m2Var4, 11, false);
                        y0Var2.E();
                        m2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        fy0 fy0Var = new fy0();
                        fy0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(fy0Var);
                        return;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        g11Var146.a("tg://settings/privacy-policy");
        return new g11[]{g11Var24, g11Var25, g11Var26, g11Var27, g11Var28, g11Var29, g11Var30, g11Var31, g11Var32, g11Var33, g11Var34, g11Var35, g11Var36, g11Var37, g11Var38, g11Var39, g11Var40, g11Var, g11Var42, g11Var43, g11Var2, g11Var45, g11Var46, g11Var47, g11Var48, g11Var49, g11Var50, g11Var51, g11Var52, g11Var53, g11Var3, g11Var4, g11Var55, g11Var56, g11Var57, g11Var58, g11Var59, g11Var60, g11Var61, g11Var62, g11Var63, g11Var64, g11Var65, g11Var66, g11Var67, g11Var68, g11Var69, g11Var70, g11Var71, g11Var72, g11Var73, g11Var74, g11Var75, g11Var76, g11Var77, g11Var78, g11Var79, g11Var80, g11Var81, g11Var82, g11Var83, g11Var84, g11Var85, g11Var86, g11Var87, g11Var88, g11Var89, g11Var90, g11Var91, g11Var92, g11Var93, g11Var94, g11Var95, g11Var96, g11Var97, g11Var98, g11Var99, g11Var100, g11Var101, g11Var102, g11Var103, g11Var104, g11Var105, g11Var106, g11Var107, g11Var108, g11Var109, g11Var110, g11Var111, g11Var112, g11Var113, g11Var6, g11Var115, g11Var7, g11Var117, g11Var8, g11Var119, g11Var120, g11Var121, g11Var122, g11Var5, g11Var9, g11Var10, g11Var11, g11Var12, g11Var13, g11Var14, g11Var15, g11Var16, g11Var17, g11Var18, g11Var19, g11Var20, g11Var21, g11Var22, g11Var124, g11Var125, g11Var126, g11Var127, g11Var128, g11Var129, g11Var130, g11Var131, g11Var132, g11Var133, g11Var134, g11Var135, g11Var23, g11Var136, g11Var137, g11Var138, g11Var139, g11Var140, g11Var141, g11Var142, g11Var44, g11Var144, g11Var145, g11Var146};
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f == 0) {
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
        if (!this.f38219w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof g11) {
                ((g11) obj2).f37848g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f38215f;
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
        this.f38221y = str;
        if (this.f38220x != null) {
            Utilities.searchQueue.cancelRunnable(this.f38220x);
            this.f38220x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f38219w = false;
            this.f38217r.clear();
            this.f38218s.clear();
            this.f38216n.clear();
            org.telegram.ui.ActionBar.m2 m2Var = this.f38214e;
            if (m2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) m2Var).P.f25349b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.f38214e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        tt0 tt0Var = new tt0(24, this, str);
        this.f38220x = tt0Var;
        dispatchQueue.postRunnable(tt0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        g11 g11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            g11[] g11VarArr = this.f38213c;
            if (i10 >= g11VarArr.length) {
                break;
            }
            g11 g11Var2 = g11VarArr[i10];
            if (g11Var2 != null) {
                hashMap.put(Integer.valueOf(g11Var2.f37847f), this.f38213c[i10]);
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
                    } else if (readInt322 == 1 && (g11Var = (g11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        g11Var.f37848g = readInt32;
                        arrayList.add(g11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new ff(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f38219w) {
            int size2 = this.f38217r.size();
            if (!this.f38218s.isEmpty()) {
                i10 = this.f38218s.size() + 1;
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
        if (this.f38219w) {
            if (i10 < this.f38217r.size() || i10 != this.f38217r.size()) {
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
        g11 g11Var;
        int i11;
        int i12 = d1Var.f47752f;
        View view = d1Var.f47748a;
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
        if (this.f38219w) {
            if (i10 < this.f38217r.size()) {
                g11 g11Var2 = (g11) this.f38217r.get(i10);
                if (i10 > 0) {
                    g11Var = (g11) this.f38217r.get(i10 - 1);
                } else {
                    g11Var = null;
                }
                if (g11Var != null && g11Var.f37846e == g11Var2.f37846e) {
                    i11 = 0;
                } else {
                    i11 = g11Var2.f37846e;
                }
                CharSequence charSequence = (CharSequence) this.f38216n.get(i10);
                String[] strArr = g11Var2.d;
                if (i10 >= this.f38217r.size() - 1) {
                    z10 = false;
                }
                y6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.f38217r);
            CharSequence charSequence2 = (CharSequence) this.f38216n.get(this.f38217r.size() + f7);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f38218s.get(f7)).path;
            if (f7 < this.f38217r.size() - 1) {
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
            if (obj instanceof g11) {
                g11 g11Var3 = (g11) obj;
                String str = g11Var3.f37843a;
                String[] strArr3 = g11Var3.d;
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
