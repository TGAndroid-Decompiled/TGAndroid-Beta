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
public class a11 extends org.telegram.ui.Components.vl0 {
    public TLRPC.WebPage E;
    public boolean F;
    public z01[] f31938c;
    public final org.telegram.ui.ActionBar.m2 e;
    public final int f31939f;
    public final Context h;
    public boolean f31943w;
    public ix0 f31944x;
    public String f31945y;
    public final ArrayList d = new ArrayList();
    public ArrayList f31940n = new ArrayList();
    public ArrayList f31941r = new ArrayList();
    public ArrayList f31942s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public a11(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.e = m2Var;
        this.f31939f = m2Var.getCurrentAccount();
        this.h = context;
        this.f31938c = H(m2Var);
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

    public static z01[] H(final org.telegram.ui.ActionBar.m2 m2Var) {
        z01 z01Var;
        z01 z01Var2;
        z01 z01Var3;
        z01 z01Var4;
        z01 z01Var5;
        z01 z01Var6;
        z01 z01Var7;
        z01 z01Var8;
        z01 z01Var9;
        z01 z01Var10;
        z01 z01Var11;
        z01 z01Var12;
        z01 z01Var13;
        z01 z01Var14;
        z01 z01Var15;
        z01 z01Var16;
        z01 z01Var17;
        z01 z01Var18;
        z01 z01Var19;
        z01 z01Var20;
        z01 z01Var21;
        z01 z01Var22;
        z01 z01Var23;
        final int currentAccount = m2Var.getCurrentAccount();
        z01 z01Var24 = new z01(LocaleController.getString(R.string.EditName), 500, 0, new ix0(16, m2Var, m2Var.getResourceProvider()));
        z01 z01Var25 = new z01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var25.a("tg://settings/edit/change-number");
        z01 z01Var26 = new z01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var26.a("tg://settings/edit/add-account");
        z01 z01Var27 = new z01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var27.a("tg://settings/notifications");
        z01 z01Var28 = new z01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var28.a("tg://settings/notifications/private-chats");
        z01 z01Var29 = new z01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01Var29.a("tg://settings/notifications/groups");
        z01 z01Var30 = new z01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ki0(7, m2Var));
        z01Var30.a("tg://settings/notifications/channels");
        z01 z01Var31 = new z01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ki0(19, m2Var));
        z01 z01Var32 = new z01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var33 = new z01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var34 = new z01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ki0(23, m2Var));
        z01Var34.a("tg://settings/notifications/new-contacts");
        z01 z01Var35 = new z01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var35.a("tg://settings/notifications/pinned-messages");
        z01 z01Var36 = new z01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var36.a("tg://settings/notifications/reset");
        z01 z01Var37 = new z01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01 z01Var38 = new z01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01 z01Var39 = new z01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01 z01Var40 = new z01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var40.a("tg://settings/privacy");
        z01 z01Var41 = new z01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var41.a("tg://settings/privacy/2sv");
        z01 z01Var42 = new z01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            m2Var.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(m2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.f30575b.setText(spannableStringBuilder);
                            ybVar.f30575b.setSingleLine(false);
                            ybVar.f30575b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        m2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        z01Var42.a("tg://settings/privacy/auto-delete");
        z01 z01Var43 = new z01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var43.a("tg://settings/privacy/passcode");
        z01 z01Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            z01Var = z01Var41;
            z01Var2 = new z01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(360928);
                            hc0Var.V(64);
                            return;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(360928);
                            hc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(360928);
                            hc0Var3.V(256);
                            return;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(360928);
                            hc0Var4.V(32768);
                            return;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            return;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            return;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.f34177s;
                                if (i10 < arrayList.size()) {
                                    if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                        hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            return;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            m2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
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
            z01Var2.a("tg://settings/privacy/login-email");
        } else {
            z01Var = z01Var41;
            z01Var2 = null;
        }
        z01 z01Var45 = new z01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var45.a("tg://settings/privacy/blocked");
        z01 z01Var46 = new z01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var46.a("tg://settings/devices");
        z01 z01Var47 = new z01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var47.a("tg://settings/privacy/phone-number/");
        z01 z01Var48 = new z01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var48.a("tg://settings/privacy/last-seen");
        z01 z01Var49 = new z01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var49.a("tg://settings/privacy/profile-photos");
        z01 z01Var50 = new z01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var50.a("tg://settings/privacy/forwards");
        z01 z01Var51 = new z01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var51.a("tg://settings/privacy/calls/p2p");
        z01 z01Var52 = new z01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var52.a("tg://settings/privacy/calls");
        z01 z01Var53 = new z01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var53.a("tg://settings/privacy/invites");
        z01 z01Var54 = new z01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            m2Var.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(m2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.f30575b.setText(spannableStringBuilder);
                            ybVar.f30575b.setSingleLine(false);
                            ybVar.f30575b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        m2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        z01Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            z01Var3 = z01Var54;
            z01Var4 = new z01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
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
                                m2Var.presentFragment(new qg0(i10));
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
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
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
                            m2Var.presentFragment(new z6());
                            return;
                        case 24:
                            m2Var.presentFragment(new z6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new z6());
                            return;
                        case 27:
                            m2Var.presentFragment(new z6());
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
            z01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            z01Var3 = z01Var54;
            z01Var4 = null;
        }
        z01 z01Var55 = new z01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var55.a("tg://settings/privacy/self-destruct");
        z01 z01Var56 = new z01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        z01 z01Var57 = new z01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var57.a("tg://settings/privacy/active-websites");
        z01 z01Var58 = new z01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var58.a("tg://settings/privacy/data-settings/delete-synced");
        z01 z01Var59 = new z01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        z01 z01Var60 = new z01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        z01 z01Var61 = new z01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var61.a("tg://settings/privacy/data-settings/map-provider");
        z01 z01Var62 = new z01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var62.a("tg://settings/privacy/data-settings/link-previews");
        z01 z01Var63 = new z01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var63.a("tg://settings/devices");
        z01 z01Var64 = new z01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var64.a("tg://settings/devices/terminate-sessions");
        z01 z01Var65 = new z01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var65.a("tg://settings/devices/link-desktop");
        z01 z01Var66 = new z01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var66.a("tg://settings/privacy/data-settings");
        z01 z01Var67 = new z01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01 z01Var68 = new z01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var68.a("tg://settings/data/storage");
        z01 z01Var69 = new z01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01 z01Var70 = new z01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01 z01Var71 = new z01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01 z01Var72 = new z01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                            m2Var.presentFragment(new qg0(i10));
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
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
                        m2Var.presentFragment(new z6());
                        return;
                    case 24:
                        m2Var.presentFragment(new z6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        m2Var.presentFragment(new z6());
                        return;
                    case 27:
                        m2Var.presentFragment(new z6());
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
        z01Var72.a("tg://settings/data/usage");
        z01 z01Var73 = new z01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var74 = new z01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var75 = new z01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var76 = new z01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var77 = new z01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01Var77.a("tg://settings/data/auto-download/reset");
        z01 z01Var78 = new z01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var79 = new z01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var80 = new z01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var81 = new z01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01Var81.a("tg://settings/data/use-less-data");
        z01 z01Var82 = new z01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var83 = new z01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01Var83.a("tg://settings/data/proxy");
        z01 z01Var84 = new z01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        z01 z01Var85 = new z01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01 z01Var86 = new z01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01Var86.a("tg://settings/data/save-to-photos/chats");
        z01 z01Var87 = new z01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
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
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        z01Var87.a("tg://settings/data/save-to-photos/groups");
        z01 z01Var88 = new z01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ki0(2, m2Var));
        z01Var88.a("tg://settings/data/save-to-photos/channels");
        z01 z01Var89 = new z01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ki0(3, m2Var));
        z01Var89.a("tg://settings/appearance/themes");
        z01 z01Var90 = new z01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(4, m2Var));
        z01Var90.a("tg://settings/appearance/text-size");
        z01 z01Var91 = new z01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(5, m2Var));
        z01Var91.a("tg://settings/appearance/wallpapers");
        z01 z01Var92 = new z01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ki0(6, m2Var));
        z01 z01Var93 = new z01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ki0(8, m2Var));
        z01 z01Var94 = new z01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(9, m2Var));
        z01 z01Var95 = new z01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(10, m2Var));
        z01 z01Var96 = new z01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ki0(11, m2Var));
        z01Var96.a("tg://settings/appearance/themes/create");
        z01 z01Var97 = new z01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(13, m2Var));
        z01Var97.a("tg://settings/appearance/message-corners");
        z01 z01Var98 = new z01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(14, m2Var));
        z01 z01Var99 = new z01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(15, m2Var));
        z01 z01Var100 = new z01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(16, m2Var));
        z01Var100.a("tg://settings/appearance/app-icon");
        z01 z01Var101 = new z01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(17, m2Var));
        z01 z01Var102 = new z01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(18, m2Var));
        z01Var102.a("tg://settings/appearance/tap-for-next-media");
        z01 z01Var103 = new z01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(20, m2Var));
        z01Var103.a("tg://settings/data/raise-to-listen");
        z01 z01Var104 = new z01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(21, m2Var));
        z01Var104.a("tg://settings/data/raise-to-speak");
        z01 z01Var105 = new z01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(22, m2Var));
        z01Var105.a("tg://settings/data/pause-music");
        z01 z01Var106 = new z01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(24, m2Var));
        z01 z01Var107 = new z01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(25, m2Var));
        z01 z01Var108 = new z01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(26, m2Var));
        z01 z01Var109 = new z01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(27, m2Var));
        z01 z01Var110 = new z01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new ki0(28, m2Var));
        z01Var110.a("tg://settings/appearance/stickers-and-emoji");
        z01 z01Var111 = new z01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new ki0(29, m2Var));
        z01 z01Var112 = new z01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var113 = new z01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var114 = new z01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        z01 z01Var115 = new z01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var116 = new z01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        z01 z01Var117 = new z01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var118 = new z01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        z01 z01Var119 = new z01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        z01 z01Var120 = new z01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var121 = new z01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        z01 z01Var122 = new z01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var122.a("tg://settings/folders");
        z01 z01Var123 = new z01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            z01Var5 = z01Var123;
            z01Var6 = z01Var114;
            z01Var7 = z01Var116;
            z01Var8 = z01Var118;
            z01Var9 = new z01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(360928);
                            hc0Var.V(64);
                            return;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(360928);
                            hc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(360928);
                            hc0Var3.V(256);
                            return;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(360928);
                            hc0Var4.V(32768);
                            return;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            return;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            return;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.f34177s;
                                if (i10 < arrayList.size()) {
                                    if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                        hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            return;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            m2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
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
            z01Var5 = z01Var123;
            z01Var6 = z01Var114;
            z01Var7 = z01Var116;
            z01Var8 = z01Var118;
            z01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            z01Var10 = new z01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(360928);
                            hc0Var.V(64);
                            return;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(360928);
                            hc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(360928);
                            hc0Var3.V(256);
                            return;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(360928);
                            hc0Var4.V(32768);
                            return;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            return;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            return;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.f34177s;
                                if (i10 < arrayList.size()) {
                                    if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                        hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            return;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            m2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
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
            z01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            z01Var11 = new z01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(360928);
                            hc0Var.V(64);
                            return;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(360928);
                            hc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(360928);
                            hc0Var3.V(256);
                            return;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(360928);
                            hc0Var4.V(32768);
                            return;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            return;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            return;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.f34177s;
                                if (i10 < arrayList.size()) {
                                    if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                        hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            return;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            m2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
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
            z01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            z01Var12 = new z01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
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
                                m2Var.presentFragment(new qg0(i10));
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
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
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
                            m2Var.presentFragment(new z6());
                            return;
                        case 24:
                            m2Var.presentFragment(new z6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new z6());
                            return;
                        case 27:
                            m2Var.presentFragment(new z6());
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
            z01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            z01Var13 = new z01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
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
                                m2Var.presentFragment(new qg0(i10));
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
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
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
                            m2Var.presentFragment(new z6());
                            return;
                        case 24:
                            m2Var.presentFragment(new z6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new z6());
                            return;
                        case 27:
                            m2Var.presentFragment(new z6());
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
            z01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            z01Var14 = new z01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
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
                                m2Var.presentFragment(new qg0(i10));
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
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
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
                            m2Var.presentFragment(new z6());
                            return;
                        case 24:
                            m2Var.presentFragment(new z6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 26:
                            m2Var.presentFragment(new z6());
                            return;
                        case 27:
                            m2Var.presentFragment(new z6());
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
            z01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            z01Var15 = new z01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
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
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            return;
                    }
                }
            });
        } else {
            z01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            z01Var16 = new z01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
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
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            return;
                    }
                }
            });
        } else {
            z01Var16 = null;
        }
        if (F(currentAccount, 5)) {
            z01Var17 = new z01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ki0(12, m2Var));
        } else {
            z01Var17 = null;
        }
        if (F(currentAccount, 9)) {
            z01Var18 = new z01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            m2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new q(1));
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
                            m2Var.presentFragment(new d31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            return;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            return;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            return;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(28700);
                            hc0Var5.V(16388);
                            return;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(28700);
                            hc0Var6.V(8200);
                            return;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(28700);
                            hc0Var7.V(4112);
                            return;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(360928);
                            return;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(360928);
                            hc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            z01Var18 = null;
        }
        if (F(currentAccount, 6)) {
            z01Var19 = new z01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            m2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new q(1));
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
                            m2Var.presentFragment(new d31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            return;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            return;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            return;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(28700);
                            hc0Var5.V(16388);
                            return;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(28700);
                            hc0Var6.V(8200);
                            return;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(28700);
                            hc0Var7.V(4112);
                            return;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(360928);
                            return;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(360928);
                            hc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            z01Var19 = null;
        }
        if (F(currentAccount, 7)) {
            z01Var20 = new z01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            m2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new q(1));
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
                            m2Var.presentFragment(new d31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            return;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            return;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            return;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(28700);
                            hc0Var5.V(16388);
                            return;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(28700);
                            hc0Var6.V(8200);
                            return;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(28700);
                            hc0Var7.V(4112);
                            return;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(360928);
                            return;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(360928);
                            hc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            z01Var20 = null;
        }
        if (F(currentAccount, 10)) {
            z01Var21 = new z01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            m2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new q(1));
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
                            m2Var.presentFragment(new d31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            return;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            return;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            return;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(28700);
                            hc0Var5.V(16388);
                            return;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(28700);
                            hc0Var6.V(8200);
                            return;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(28700);
                            hc0Var7.V(4112);
                            return;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(360928);
                            return;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(360928);
                            hc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            z01Var21 = null;
        }
        if (F(currentAccount, 12)) {
            z01Var22 = new z01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            m2Var.presentFragment(new q(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            m2Var.presentFragment(new q(1));
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
                            m2Var.presentFragment(new d31());
                            return;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            return;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            return;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            return;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            return;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(28700);
                            return;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(28700);
                            hc0Var5.V(16388);
                            return;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(28700);
                            hc0Var6.V(8200);
                            return;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(28700);
                            hc0Var7.V(4112);
                            return;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(360928);
                            return;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(360928);
                            hc0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            z01Var22 = null;
        }
        z01 z01Var124 = new z01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var124.a("tg://settings/power-saving");
        z01 z01Var125 = new z01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var125.a("tg://settings/power-saving/stickers");
        z01 z01Var126 = new z01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var127 = new z01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var128 = new z01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var128.a("tg://settings/power-saving/emoji");
        z01 z01Var129 = new z01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var130 = new z01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var131 = new z01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01 z01Var132 = new z01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var132.a("tg://settings/power-saving/effects");
        z01 z01Var133 = new z01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                        m2Var.presentFragment(new q(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        m2Var.presentFragment(new q(1));
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
                        m2Var.presentFragment(new d31());
                        return;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        return;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        return;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        return;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        return;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(28700);
                        return;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(28700);
                        hc0Var5.V(16388);
                        return;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(28700);
                        hc0Var6.V(8200);
                        return;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(28700);
                        hc0Var7.V(4112);
                        return;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(360928);
                        return;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(360928);
                        hc0Var9.V(32);
                        return;
                }
            }
        });
        z01Var133.a("tg://settings/power-saving/background");
        z01 z01Var134 = new z01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01 z01Var135 = new z01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
            z01Var23 = new z01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(360928);
                            hc0Var.V(64);
                            return;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(360928);
                            hc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(360928);
                            hc0Var3.V(256);
                            return;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(360928);
                            hc0Var4.V(32768);
                            return;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            return;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            return;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.f34177s;
                                if (i10 < arrayList.size()) {
                                    if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                        hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            return;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            m2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
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
            z01Var23 = null;
        }
        z01 z01Var136 = new z01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01 z01Var137 = new z01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var137.a("tg://settings/power-saving/call-animations");
        z01 z01Var138 = new z01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var138.a("tg://settings/power-saving/videos");
        z01 z01Var139 = new z01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var139.a("tg://settings/power-saving/gifs");
        z01 z01Var140 = new z01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var140.a("tg://settings/power-saving/transitions");
        z01 z01Var141 = new z01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var141.a("tg://settings/language");
        z01 z01Var142 = new z01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            z01 z01Var143 = new z01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(360928);
                            hc0Var.V(64);
                            return;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(360928);
                            hc0Var2.V(128);
                            return;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(360928);
                            hc0Var3.V(256);
                            return;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(360928);
                            hc0Var4.V(32768);
                            return;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            return;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            return;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            return;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.f34177s;
                                if (i10 < arrayList.size()) {
                                    if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                        hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            return;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            m2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            return;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
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
            z01Var143.a("tg://settings/language/do-not-translate");
            z01Var44 = z01Var143;
        }
        z01 z01Var144 = new z01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var144.a("tg://settings/ask-question");
        z01 z01Var145 = new z01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var145.a("tg://settings/faq");
        z01 z01Var146 = new z01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(360928);
                        hc0Var.V(64);
                        return;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(360928);
                        hc0Var2.V(128);
                        return;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(360928);
                        hc0Var3.V(256);
                        return;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(360928);
                        hc0Var4.V(32768);
                        return;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        return;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        return;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        return;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.f34177s;
                            if (i10 < arrayList.size()) {
                                if (((bc0) arrayList.get(i10)).f32372f == 1) {
                                    hc0Var8.f34172b.e1(new i2.s(hc0Var8, i10, 13), 700, true);
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
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        return;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        m2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        return;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
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
        z01Var146.a("tg://settings/privacy-policy");
        return new z01[]{z01Var24, z01Var25, z01Var26, z01Var27, z01Var28, z01Var29, z01Var30, z01Var31, z01Var32, z01Var33, z01Var34, z01Var35, z01Var36, z01Var37, z01Var38, z01Var39, z01Var40, z01Var, z01Var42, z01Var43, z01Var2, z01Var45, z01Var46, z01Var47, z01Var48, z01Var49, z01Var50, z01Var51, z01Var52, z01Var53, z01Var3, z01Var4, z01Var55, z01Var56, z01Var57, z01Var58, z01Var59, z01Var60, z01Var61, z01Var62, z01Var63, z01Var64, z01Var65, z01Var66, z01Var67, z01Var68, z01Var69, z01Var70, z01Var71, z01Var72, z01Var73, z01Var74, z01Var75, z01Var76, z01Var77, z01Var78, z01Var79, z01Var80, z01Var81, z01Var82, z01Var83, z01Var84, z01Var85, z01Var86, z01Var87, z01Var88, z01Var89, z01Var90, z01Var91, z01Var92, z01Var93, z01Var94, z01Var95, z01Var96, z01Var97, z01Var98, z01Var99, z01Var100, z01Var101, z01Var102, z01Var103, z01Var104, z01Var105, z01Var106, z01Var107, z01Var108, z01Var109, z01Var110, z01Var111, z01Var112, z01Var113, z01Var6, z01Var115, z01Var7, z01Var117, z01Var8, z01Var119, z01Var120, z01Var121, z01Var122, z01Var5, z01Var9, z01Var10, z01Var11, z01Var12, z01Var13, z01Var14, z01Var15, z01Var16, z01Var17, z01Var18, z01Var19, z01Var20, z01Var21, z01Var22, z01Var124, z01Var125, z01Var126, z01Var127, z01Var128, z01Var129, z01Var130, z01Var131, z01Var132, z01Var133, z01Var134, z01Var135, z01Var23, z01Var136, z01Var137, z01Var138, z01Var139, z01Var140, z01Var141, z01Var142, z01Var44, z01Var144, z01Var145, z01Var146};
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42949f == 0) {
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
        if (!this.f31943w) {
            l();
        }
        if (arrayList.size() > 20) {
            a4.a.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof z01) {
                ((z01) obj2).f40294g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f31939f;
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
        this.f31945y = str;
        if (this.f31944x != null) {
            Utilities.searchQueue.cancelRunnable(this.f31944x);
            this.f31944x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f31943w = false;
            this.f31941r.clear();
            this.f31942s.clear();
            this.f31940n.clear();
            org.telegram.ui.ActionBar.m2 m2Var = this.e;
            if (m2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) m2Var).P.f25164b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ix0 ix0Var = new ix0(17, this, str);
        this.f31944x = ix0Var;
        dispatchQueue.postRunnable(ix0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        z01 z01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            z01[] z01VarArr = this.f31938c;
            if (i10 >= z01VarArr.length) {
                break;
            }
            z01 z01Var2 = z01VarArr[i10];
            if (z01Var2 != null) {
                hashMap.put(Integer.valueOf(z01Var2.f40293f), this.f31938c[i10]);
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
                    } else if (readInt322 == 1 && (z01Var = (z01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        z01Var.f40294g = readInt32;
                        arrayList.add(z01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new cf(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f31943w) {
            int size2 = this.f31941r.size();
            if (!this.f31942s.isEmpty()) {
                i10 = this.f31942s.size() + 1;
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
        if (this.f31943w) {
            if (i10 < this.f31941r.size() || i10 != this.f31941r.size()) {
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
        z01 z01Var;
        int i11;
        int i12 = c1Var.f42949f;
        View view = c1Var.f42946a;
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
        if (this.f31943w) {
            if (i10 < this.f31941r.size()) {
                z01 z01Var2 = (z01) this.f31941r.get(i10);
                if (i10 > 0) {
                    z01Var = (z01) this.f31941r.get(i10 - 1);
                } else {
                    z01Var = null;
                }
                if (z01Var != null && z01Var.e == z01Var2.e) {
                    i11 = 0;
                } else {
                    i11 = z01Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f31940n.get(i10);
                String[] strArr = z01Var2.d;
                if (i10 >= this.f31941r.size() - 1) {
                    z10 = false;
                }
                y6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.f31941r);
            CharSequence charSequence2 = (CharSequence) this.f31940n.get(this.f31941r.size() + f7);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f31942s.get(f7)).path;
            if (f7 < this.f31941r.size() - 1) {
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
            if (obj instanceof z01) {
                z01 z01Var3 = (z01) obj;
                String str = z01Var3.f40290a;
                String[] strArr3 = z01Var3.d;
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
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
        y6Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(y6Var);
    }
}
