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
public class p11 extends org.telegram.ui.Components.lm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public o11[] f39096c;
    public final org.telegram.ui.ActionBar.m2 e;
    public final int f39097f;
    public final Context h;
    public boolean f39101w;
    public hz0 f39102x;
    public String f39103y;
    public final ArrayList d = new ArrayList();
    public ArrayList f39098n = new ArrayList();
    public ArrayList f39099r = new ArrayList();
    public ArrayList f39100s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public p11(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.e = m2Var;
        this.f39097f = m2Var.getCurrentAccount();
        this.h = context;
        this.f39096c = H(m2Var);
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

    public static o11[] H(final org.telegram.ui.ActionBar.m2 m2Var) {
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
        o11 o11Var23;
        final int currentAccount = m2Var.getCurrentAccount();
        o11 o11Var24 = new o11(LocaleController.getString(R.string.EditName), 500, 0, new hz0(5, m2Var, m2Var.getResourceProvider()));
        o11 o11Var25 = new o11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var25.a("tg://settings/edit/change-number");
        o11 o11Var26 = new o11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var26.a("tg://settings/edit/add-account");
        o11 o11Var27 = new o11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var27.a("tg://settings/notifications");
        o11 o11Var28 = new o11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var28.a("tg://settings/notifications/private-chats");
        o11 o11Var29 = new o11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11Var29.a("tg://settings/notifications/groups");
        o11 o11Var30 = new o11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new wi0(7, m2Var));
        o11Var30.a("tg://settings/notifications/channels");
        o11 o11Var31 = new o11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new wi0(19, m2Var));
        o11 o11Var32 = new o11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var33 = new o11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var34 = new o11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new wi0(23, m2Var));
        o11Var34.a("tg://settings/notifications/new-contacts");
        o11 o11Var35 = new o11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11Var35.a("tg://settings/notifications/pinned-messages");
        o11 o11Var36 = new o11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var36.a("tg://settings/notifications/reset");
        o11 o11Var37 = new o11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11 o11Var38 = new o11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11 o11Var39 = new o11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11 o11Var40 = new o11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var40.a("tg://settings/privacy");
        o11 o11Var41 = new o11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var41.a("tg://settings/privacy/2sv");
        o11 o11Var42 = new o11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            m2Var.presentFragment(new u4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(m2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), null);
                            acVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new di.zb(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            acVar.f23513b.setText(spannableStringBuilder);
                            acVar.f23513b.setSingleLine(false);
                            acVar.f23513b.setMaxLines(2);
                            a02.b(acVar, 2750).j();
                            return;
                        }
                        m2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        o11Var42.a("tg://settings/privacy/auto-delete");
        o11 o11Var43 = new o11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var43.a("tg://settings/privacy/passcode");
        o11 o11Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            o11Var = o11Var41;
            o11Var2 = new o11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.W(360928);
                            rc0Var.V(64);
                            return;
                        case 1:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(360928);
                            rc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(360928);
                            rc0Var3.V(256);
                            return;
                        case 4:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.W(360928);
                            rc0Var4.V(32768);
                            return;
                        case 5:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.V(1024);
                            return;
                        case 8:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.V(2048);
                            return;
                        case 9:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = rc0Var8.f39763s;
                                if (i10 < arrayList.size()) {
                                    if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                        rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                            my0 my0Var = new my0();
                            my0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(my0Var);
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
            o11Var2.a("tg://settings/privacy/login-email");
        } else {
            o11Var = o11Var41;
            o11Var2 = null;
        }
        o11 o11Var45 = new o11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var45.a("tg://settings/privacy/blocked");
        o11 o11Var46 = new o11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var46.a("tg://settings/devices");
        o11 o11Var47 = new o11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var47.a("tg://settings/privacy/phone-number/");
        o11 o11Var48 = new o11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var48.a("tg://settings/privacy/last-seen");
        o11 o11Var49 = new o11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var49.a("tg://settings/privacy/profile-photos");
        o11 o11Var50 = new o11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var50.a("tg://settings/privacy/forwards");
        o11 o11Var51 = new o11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var51.a("tg://settings/privacy/calls/p2p");
        o11 o11Var52 = new o11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var52.a("tg://settings/privacy/calls");
        o11 o11Var53 = new o11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var53.a("tg://settings/privacy/invites");
        o11 o11Var54 = new o11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            m2Var.presentFragment(new u4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(m2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), null);
                            acVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new di.zb(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            acVar.f23513b.setText(spannableStringBuilder);
                            acVar.f23513b.setSingleLine(false);
                            acVar.f23513b.setMaxLines(2);
                            a02.b(acVar, 2750).j();
                            return;
                        }
                        m2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        o11Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            o11Var3 = o11Var54;
            o11Var4 = new o11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                                m2Var.presentFragment(new bh0(i10));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                            m2Var.presentFragment(new d7());
                            return;
                        case 24:
                            m2Var.presentFragment(new d7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new d7());
                            return;
                        case 27:
                            m2Var.presentFragment(new d7());
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
            o11Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            o11Var3 = o11Var54;
            o11Var4 = null;
        }
        o11 o11Var55 = new o11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var55.a("tg://settings/privacy/self-destruct");
        o11 o11Var56 = new o11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        o11 o11Var57 = new o11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var57.a("tg://settings/privacy/active-websites");
        o11 o11Var58 = new o11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var58.a("tg://settings/privacy/data-settings/delete-synced");
        o11 o11Var59 = new o11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        o11 o11Var60 = new o11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        o11 o11Var61 = new o11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var61.a("tg://settings/privacy/data-settings/map-provider");
        o11 o11Var62 = new o11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var62.a("tg://settings/privacy/data-settings/link-previews");
        o11 o11Var63 = new o11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var63.a("tg://settings/devices");
        o11 o11Var64 = new o11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var64.a("tg://settings/devices/terminate-sessions");
        o11 o11Var65 = new o11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var65.a("tg://settings/devices/link-desktop");
        o11 o11Var66 = new o11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var66.a("tg://settings/privacy/data-settings");
        o11 o11Var67 = new o11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11 o11Var68 = new o11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var68.a("tg://settings/data/storage");
        o11 o11Var69 = new o11(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11 o11Var70 = new o11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11 o11Var71 = new o11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11 o11Var72 = new o11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                            m2Var.presentFragment(new bh0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                        m2Var.presentFragment(new d7());
                        return;
                    case 24:
                        m2Var.presentFragment(new d7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new d7());
                        return;
                    case 27:
                        m2Var.presentFragment(new d7());
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
        o11Var72.a("tg://settings/data/usage");
        o11 o11Var73 = new o11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var74 = new o11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var75 = new o11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var76 = new o11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var77 = new o11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11Var77.a("tg://settings/data/auto-download/reset");
        o11 o11Var78 = new o11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var79 = new o11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var80 = new o11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var81 = new o11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11Var81.a("tg://settings/data/use-less-data");
        o11 o11Var82 = new o11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var83 = new o11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11Var83.a("tg://settings/data/proxy");
        o11 o11Var84 = new o11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11 o11Var86 = new o11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11Var86.a("tg://settings/data/save-to-photos/chats");
        o11 o11Var87 = new o11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o11Var87.a("tg://settings/data/save-to-photos/groups");
        o11 o11Var88 = new o11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new wi0(2, m2Var));
        o11Var88.a("tg://settings/data/save-to-photos/channels");
        o11 o11Var89 = new o11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new wi0(3, m2Var));
        o11Var89.a("tg://settings/appearance/themes");
        o11 o11Var90 = new o11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(4, m2Var));
        o11Var90.a("tg://settings/appearance/text-size");
        o11 o11Var91 = new o11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(5, m2Var));
        o11Var91.a("tg://settings/appearance/wallpapers");
        o11 o11Var92 = new o11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new wi0(6, m2Var));
        o11 o11Var93 = new o11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new wi0(8, m2Var));
        o11 o11Var94 = new o11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(9, m2Var));
        o11 o11Var95 = new o11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(10, m2Var));
        o11 o11Var96 = new o11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new wi0(11, m2Var));
        o11Var96.a("tg://settings/appearance/themes/create");
        o11 o11Var97 = new o11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(13, m2Var));
        o11Var97.a("tg://settings/appearance/message-corners");
        o11 o11Var98 = new o11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(14, m2Var));
        o11 o11Var99 = new o11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(15, m2Var));
        o11 o11Var100 = new o11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(16, m2Var));
        o11Var100.a("tg://settings/appearance/app-icon");
        o11 o11Var101 = new o11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(17, m2Var));
        o11 o11Var102 = new o11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(18, m2Var));
        o11Var102.a("tg://settings/appearance/tap-for-next-media");
        o11 o11Var103 = new o11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(20, m2Var));
        o11Var103.a("tg://settings/data/raise-to-listen");
        o11 o11Var104 = new o11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(21, m2Var));
        o11Var104.a("tg://settings/data/raise-to-speak");
        o11 o11Var105 = new o11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(22, m2Var));
        o11Var105.a("tg://settings/data/pause-music");
        o11 o11Var106 = new o11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(24, m2Var));
        o11 o11Var107 = new o11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(25, m2Var));
        o11 o11Var108 = new o11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(26, m2Var));
        o11 o11Var109 = new o11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new wi0(27, m2Var));
        o11 o11Var110 = new o11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new wi0(28, m2Var));
        o11Var110.a("tg://settings/appearance/stickers-and-emoji");
        o11 o11Var111 = new o11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new wi0(29, m2Var));
        o11 o11Var112 = new o11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var113 = new o11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var114 = new o11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var116 = new o11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var118 = new o11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var121 = new o11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            o11Var5 = o11Var123;
            o11Var6 = o11Var114;
            o11Var7 = o11Var116;
            o11Var8 = o11Var118;
            o11Var9 = new o11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.W(360928);
                            rc0Var.V(64);
                            return;
                        case 1:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(360928);
                            rc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(360928);
                            rc0Var3.V(256);
                            return;
                        case 4:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.W(360928);
                            rc0Var4.V(32768);
                            return;
                        case 5:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.V(1024);
                            return;
                        case 8:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.V(2048);
                            return;
                        case 9:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = rc0Var8.f39763s;
                                if (i10 < arrayList.size()) {
                                    if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                        rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                            my0 my0Var = new my0();
                            my0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(my0Var);
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
            o11Var5 = o11Var123;
            o11Var6 = o11Var114;
            o11Var7 = o11Var116;
            o11Var8 = o11Var118;
            o11Var9 = null;
        }
        if (F(currentAccount, 0)) {
            o11Var10 = new o11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.W(360928);
                            rc0Var.V(64);
                            return;
                        case 1:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(360928);
                            rc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(360928);
                            rc0Var3.V(256);
                            return;
                        case 4:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.W(360928);
                            rc0Var4.V(32768);
                            return;
                        case 5:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.V(1024);
                            return;
                        case 8:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.V(2048);
                            return;
                        case 9:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = rc0Var8.f39763s;
                                if (i10 < arrayList.size()) {
                                    if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                        rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                            my0 my0Var = new my0();
                            my0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(my0Var);
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
            o11Var10 = null;
        }
        if (F(currentAccount, 11)) {
            o11Var11 = new o11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.W(360928);
                            rc0Var.V(64);
                            return;
                        case 1:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(360928);
                            rc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(360928);
                            rc0Var3.V(256);
                            return;
                        case 4:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.W(360928);
                            rc0Var4.V(32768);
                            return;
                        case 5:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.V(1024);
                            return;
                        case 8:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.V(2048);
                            return;
                        case 9:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = rc0Var8.f39763s;
                                if (i10 < arrayList.size()) {
                                    if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                        rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                            my0 my0Var = new my0();
                            my0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(my0Var);
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
            o11Var11 = null;
        }
        if (F(currentAccount, 1)) {
            o11Var12 = new o11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                                m2Var.presentFragment(new bh0(i10));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                            m2Var.presentFragment(new d7());
                            return;
                        case 24:
                            m2Var.presentFragment(new d7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new d7());
                            return;
                        case 27:
                            m2Var.presentFragment(new d7());
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
            o11Var12 = null;
        }
        if (F(currentAccount, 2)) {
            o11Var13 = new o11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                                m2Var.presentFragment(new bh0(i10));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                            m2Var.presentFragment(new d7());
                            return;
                        case 24:
                            m2Var.presentFragment(new d7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new d7());
                            return;
                        case 27:
                            m2Var.presentFragment(new d7());
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
            o11Var13 = null;
        }
        if (F(currentAccount, 8)) {
            o11Var14 = new o11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 1, false);
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
                                m2Var.presentFragment(new bh0(i10));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 2, false);
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
                            m2Var.presentFragment(new d7());
                            return;
                        case 24:
                            m2Var.presentFragment(new d7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 8, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new d7());
                            return;
                        case 27:
                            m2Var.presentFragment(new d7());
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
            o11Var14 = null;
        }
        if (F(currentAccount, 3)) {
            o11Var15 = new o11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            o11Var15 = null;
        }
        if (F(currentAccount, 4)) {
            o11Var16 = new o11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 3, false);
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
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 4, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            o11Var16 = null;
        }
        if (F(currentAccount, 5)) {
            o11Var17 = new o11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new wi0(12, m2Var));
        } else {
            o11Var17 = null;
        }
        if (F(currentAccount, 9)) {
            o11Var18 = new o11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                            m2Var.presentFragment(new s31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new rc0());
                            return;
                        case 19:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.V(3);
                            return;
                        case 20:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(3);
                            rc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(3);
                            rc0Var3.V(2);
                            return;
                        case 23:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.W(28700);
                            rc0Var5.V(16388);
                            return;
                        case 26:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.W(28700);
                            rc0Var6.V(8200);
                            return;
                        case 27:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.W(28700);
                            rc0Var7.V(4112);
                            return;
                        case 28:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            rc0Var8.V(360928);
                            return;
                        default:
                            rc0 rc0Var9 = new rc0();
                            m2Var.presentFragment(rc0Var9);
                            rc0Var9.W(360928);
                            rc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o11Var18 = null;
        }
        if (F(currentAccount, 6)) {
            o11Var19 = new o11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                            m2Var.presentFragment(new s31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new rc0());
                            return;
                        case 19:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.V(3);
                            return;
                        case 20:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(3);
                            rc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(3);
                            rc0Var3.V(2);
                            return;
                        case 23:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.W(28700);
                            rc0Var5.V(16388);
                            return;
                        case 26:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.W(28700);
                            rc0Var6.V(8200);
                            return;
                        case 27:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.W(28700);
                            rc0Var7.V(4112);
                            return;
                        case 28:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            rc0Var8.V(360928);
                            return;
                        default:
                            rc0 rc0Var9 = new rc0();
                            m2Var.presentFragment(rc0Var9);
                            rc0Var9.W(360928);
                            rc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o11Var19 = null;
        }
        if (F(currentAccount, 7)) {
            o11Var20 = new o11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                            m2Var.presentFragment(new s31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new rc0());
                            return;
                        case 19:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.V(3);
                            return;
                        case 20:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(3);
                            rc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(3);
                            rc0Var3.V(2);
                            return;
                        case 23:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.W(28700);
                            rc0Var5.V(16388);
                            return;
                        case 26:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.W(28700);
                            rc0Var6.V(8200);
                            return;
                        case 27:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.W(28700);
                            rc0Var7.V(4112);
                            return;
                        case 28:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            rc0Var8.V(360928);
                            return;
                        default:
                            rc0 rc0Var9 = new rc0();
                            m2Var.presentFragment(rc0Var9);
                            rc0Var9.W(360928);
                            rc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o11Var20 = null;
        }
        if (F(currentAccount, 10)) {
            o11Var21 = new o11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                            m2Var.presentFragment(new s31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new rc0());
                            return;
                        case 19:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.V(3);
                            return;
                        case 20:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(3);
                            rc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(3);
                            rc0Var3.V(2);
                            return;
                        case 23:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.W(28700);
                            rc0Var5.V(16388);
                            return;
                        case 26:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.W(28700);
                            rc0Var6.V(8200);
                            return;
                        case 27:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.W(28700);
                            rc0Var7.V(4112);
                            return;
                        case 28:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            rc0Var8.V(360928);
                            return;
                        default:
                            rc0 rc0Var9 = new rc0();
                            m2Var.presentFragment(rc0Var9);
                            rc0Var9.W(360928);
                            rc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o11Var21 = null;
        }
        if (F(currentAccount, 12)) {
            o11Var22 = new o11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                            m2Var.presentFragment(new s31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                            y0Var2.E();
                            m2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                            y0Var3.E();
                            m2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                            y0Var4.E();
                            m2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                            y0Var5.E();
                            m2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new rc0());
                            return;
                        case 19:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.V(3);
                            return;
                        case 20:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(3);
                            rc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(3);
                            rc0Var3.V(2);
                            return;
                        case 23:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.W(28700);
                            rc0Var5.V(16388);
                            return;
                        case 26:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.W(28700);
                            rc0Var6.V(8200);
                            return;
                        case 27:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.W(28700);
                            rc0Var7.V(4112);
                            return;
                        case 28:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            rc0Var8.V(360928);
                            return;
                        default:
                            rc0 rc0Var9 = new rc0();
                            m2Var.presentFragment(rc0Var9);
                            rc0Var9.W(360928);
                            rc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o11Var22 = null;
        }
        o11 o11Var124 = new o11(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var127 = new o11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var128 = new o11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var130 = new o11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var131 = new o11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
                        return;
                }
            }
        });
        o11 o11Var132 = new o11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 9, false);
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
                        m2Var.presentFragment(new s31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        sg.y0 y0Var2 = new sg.y0(m2Var3, 6, false);
                        y0Var2.E();
                        m2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        sg.y0 y0Var3 = new sg.y0(m2Var4, 7, false);
                        y0Var3.E();
                        m2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        sg.y0 y0Var4 = new sg.y0(m2Var5, 10, false);
                        y0Var4.E();
                        m2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        sg.y0 y0Var5 = new sg.y0(m2Var6, 12, false);
                        y0Var5.E();
                        m2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new rc0());
                        return;
                    case 19:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.V(3);
                        return;
                    case 20:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(3);
                        rc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(3);
                        rc0Var3.V(2);
                        return;
                    case 23:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.W(28700);
                        rc0Var5.V(16388);
                        return;
                    case 26:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.W(28700);
                        rc0Var6.V(8200);
                        return;
                    case 27:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.W(28700);
                        rc0Var7.V(4112);
                        return;
                    case 28:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        rc0Var8.V(360928);
                        return;
                    default:
                        rc0 rc0Var9 = new rc0();
                        m2Var.presentFragment(rc0Var9);
                        rc0Var9.W(360928);
                        rc0Var9.V(32);
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
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11 o11Var135 = new o11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
            o11Var23 = new o11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.W(360928);
                            rc0Var.V(64);
                            return;
                        case 1:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(360928);
                            rc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(360928);
                            rc0Var3.V(256);
                            return;
                        case 4:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.W(360928);
                            rc0Var4.V(32768);
                            return;
                        case 5:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.V(1024);
                            return;
                        case 8:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.V(2048);
                            return;
                        case 9:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = rc0Var8.f39763s;
                                if (i10 < arrayList.size()) {
                                    if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                        rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                            my0 my0Var = new my0();
                            my0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(my0Var);
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
            o11Var23 = null;
        }
        o11 o11Var136 = new o11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11 o11Var137 = new o11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var137.a("tg://settings/power-saving/call-animations");
        o11 o11Var138 = new o11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var138.a("tg://settings/power-saving/videos");
        o11 o11Var139 = new o11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var139.a("tg://settings/power-saving/gifs");
        o11 o11Var140 = new o11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var140.a("tg://settings/power-saving/transitions");
        o11 o11Var141 = new o11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var141.a("tg://settings/language");
        o11 o11Var142 = new o11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            o11 o11Var143 = new o11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            rc0 rc0Var = new rc0();
                            m2Var.presentFragment(rc0Var);
                            rc0Var.W(360928);
                            rc0Var.V(64);
                            return;
                        case 1:
                            rc0 rc0Var2 = new rc0();
                            m2Var.presentFragment(rc0Var2);
                            rc0Var2.W(360928);
                            rc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            rc0 rc0Var3 = new rc0();
                            m2Var.presentFragment(rc0Var3);
                            rc0Var3.W(360928);
                            rc0Var3.V(256);
                            return;
                        case 4:
                            rc0 rc0Var4 = new rc0();
                            m2Var.presentFragment(rc0Var4);
                            rc0Var4.W(360928);
                            rc0Var4.V(32768);
                            return;
                        case 5:
                            rc0 rc0Var5 = new rc0();
                            m2Var.presentFragment(rc0Var5);
                            rc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            rc0 rc0Var6 = new rc0();
                            m2Var.presentFragment(rc0Var6);
                            rc0Var6.V(1024);
                            return;
                        case 8:
                            rc0 rc0Var7 = new rc0();
                            m2Var.presentFragment(rc0Var7);
                            rc0Var7.V(2048);
                            return;
                        case 9:
                            rc0 rc0Var8 = new rc0();
                            m2Var.presentFragment(rc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = rc0Var8.f39763s;
                                if (i10 < arrayList.size()) {
                                    if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                        rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                            y0Var.E();
                            m2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                            return;
                        case 15:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                            my0 my0Var = new my0();
                            my0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(my0Var);
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
            o11Var143.a("tg://settings/language/do-not-translate");
            o11Var44 = o11Var143;
        }
        o11 o11Var144 = new o11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var144.a("tg://settings/ask-question");
        o11 o11Var145 = new o11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var145.a("tg://settings/faq");
        o11 o11Var146 = new o11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        rc0 rc0Var = new rc0();
                        m2Var.presentFragment(rc0Var);
                        rc0Var.W(360928);
                        rc0Var.V(64);
                        return;
                    case 1:
                        rc0 rc0Var2 = new rc0();
                        m2Var.presentFragment(rc0Var2);
                        rc0Var2.W(360928);
                        rc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        rc0 rc0Var3 = new rc0();
                        m2Var.presentFragment(rc0Var3);
                        rc0Var3.W(360928);
                        rc0Var3.V(256);
                        return;
                    case 4:
                        rc0 rc0Var4 = new rc0();
                        m2Var.presentFragment(rc0Var4);
                        rc0Var4.W(360928);
                        rc0Var4.V(32768);
                        return;
                    case 5:
                        rc0 rc0Var5 = new rc0();
                        m2Var.presentFragment(rc0Var5);
                        rc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        rc0 rc0Var6 = new rc0();
                        m2Var.presentFragment(rc0Var6);
                        rc0Var6.V(1024);
                        return;
                    case 8:
                        rc0 rc0Var7 = new rc0();
                        m2Var.presentFragment(rc0Var7);
                        rc0Var7.V(2048);
                        return;
                    case 9:
                        rc0 rc0Var8 = new rc0();
                        m2Var.presentFragment(rc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = rc0Var8.f39763s;
                            if (i10 < arrayList.size()) {
                                if (((lc0) arrayList.get(i10)).f37917f == 1) {
                                    rc0Var8.f39758b.e1(new i2.r(rc0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(m2Var2, 0, false);
                        y0Var.E();
                        m2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.g5.T(m2Var3, null));
                        return;
                    case 15:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(m2Var4, 11, false);
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
                        my0 my0Var = new my0();
                        my0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(my0Var);
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
        o11Var146.a("tg://settings/privacy-policy");
        return new o11[]{o11Var24, o11Var25, o11Var26, o11Var27, o11Var28, o11Var29, o11Var30, o11Var31, o11Var32, o11Var33, o11Var34, o11Var35, o11Var36, o11Var37, o11Var38, o11Var39, o11Var40, o11Var, o11Var42, o11Var43, o11Var2, o11Var45, o11Var46, o11Var47, o11Var48, o11Var49, o11Var50, o11Var51, o11Var52, o11Var53, o11Var3, o11Var4, o11Var55, o11Var56, o11Var57, o11Var58, o11Var59, o11Var60, o11Var61, o11Var62, o11Var63, o11Var64, o11Var65, o11Var66, o11Var67, o11Var68, o11Var69, o11Var70, o11Var71, o11Var72, o11Var73, o11Var74, o11Var75, o11Var76, o11Var77, o11Var78, o11Var79, o11Var80, o11Var81, o11Var82, o11Var83, o11Var84, o11Var85, o11Var86, o11Var87, o11Var88, o11Var89, o11Var90, o11Var91, o11Var92, o11Var93, o11Var94, o11Var95, o11Var96, o11Var97, o11Var98, o11Var99, o11Var100, o11Var101, o11Var102, o11Var103, o11Var104, o11Var105, o11Var106, o11Var107, o11Var108, o11Var109, o11Var110, o11Var111, o11Var112, o11Var113, o11Var6, o11Var115, o11Var7, o11Var117, o11Var8, o11Var119, o11Var120, o11Var121, o11Var122, o11Var5, o11Var9, o11Var10, o11Var11, o11Var12, o11Var13, o11Var14, o11Var15, o11Var16, o11Var17, o11Var18, o11Var19, o11Var20, o11Var21, o11Var22, o11Var124, o11Var125, o11Var126, o11Var127, o11Var128, o11Var129, o11Var130, o11Var131, o11Var132, o11Var133, o11Var134, o11Var135, o11Var23, o11Var136, o11Var137, o11Var138, o11Var139, o11Var140, o11Var141, o11Var142, o11Var44, o11Var144, o11Var145, o11Var146};
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
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
        if (!this.f39101w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof o11) {
                ((o11) obj2).f38839g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f39097f;
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
        this.f39103y = str;
        if (this.f39102x != null) {
            Utilities.searchQueue.cancelRunnable(this.f39102x);
            this.f39102x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f39101w = false;
            this.f39099r.clear();
            this.f39100s.clear();
            this.f39098n.clear();
            org.telegram.ui.ActionBar.m2 m2Var = this.e;
            if (m2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) m2Var).P.f30996b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        hz0 hz0Var = new hz0(6, this, str);
        this.f39102x = hz0Var;
        dispatchQueue.postRunnable(hz0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        o11 o11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            o11[] o11VarArr = this.f39096c;
            if (i10 >= o11VarArr.length) {
                break;
            }
            o11 o11Var2 = o11VarArr[i10];
            if (o11Var2 != null) {
                hashMap.put(Integer.valueOf(o11Var2.f38838f), this.f39096c[i10]);
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
                        o11Var.f38839g = readInt32;
                        arrayList.add(o11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new es0(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f39101w) {
            int size2 = this.f39099r.size();
            if (!this.f39100s.isEmpty()) {
                i10 = this.f39100s.size() + 1;
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
        if (this.f39101w) {
            if (i10 < this.f39099r.size() || i10 != this.f39099r.size()) {
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
        o11 o11Var;
        int i11;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
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
        if (this.f39101w) {
            if (i10 < this.f39099r.size()) {
                o11 o11Var2 = (o11) this.f39099r.get(i10);
                if (i10 > 0) {
                    o11Var = (o11) this.f39099r.get(i10 - 1);
                } else {
                    o11Var = null;
                }
                if (o11Var != null && o11Var.e == o11Var2.e) {
                    i11 = 0;
                } else {
                    i11 = o11Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f39098n.get(i10);
                String[] strArr = o11Var2.d;
                if (i10 >= this.f39099r.size() - 1) {
                    z10 = false;
                }
                y6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.f39099r);
            CharSequence charSequence2 = (CharSequence) this.f39098n.get(this.f39099r.size() + g10);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f39100s.get(g10)).path;
            if (g10 < this.f39099r.size() - 1) {
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
            if (obj instanceof o11) {
                o11 o11Var3 = (o11) obj;
                String str = o11Var3.f38835a;
                String[] strArr3 = o11Var3.d;
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
        int g11 = com.google.android.gms.internal.play_billing.k3.g(1, i10, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(g11);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (g11 < arrayList.size() - 1) {
            z11 = true;
        }
        y6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
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
        y6Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(y6Var);
    }
}
