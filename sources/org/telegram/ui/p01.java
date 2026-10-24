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
import org.telegram.messenger.DispatchQueue2;
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
public class p01 extends org.telegram.ui.Components.km0 {
    public TLRPC.WebPage E;
    public boolean F;
    public o01[] f40302c;
    public final org.telegram.ui.ActionBar.o2 e;
    public final int f40303f;
    public final Context h;
    public boolean f40307w;
    public lv0 f40308x;
    public String f40309y;
    public final ArrayList d = new ArrayList();
    public ArrayList f40304n = new ArrayList();
    public ArrayList f40305r = new ArrayList();
    public ArrayList f40306s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public p01(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.e = o2Var;
        this.f40303f = o2Var.getCurrentAccount();
        this.h = context;
        this.f40302c = H(o2Var);
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

    public static o01[] H(final org.telegram.ui.ActionBar.o2 o2Var) {
        o01 o01Var;
        o01 o01Var2;
        o01 o01Var3;
        o01 o01Var4;
        o01 o01Var5;
        o01 o01Var6;
        o01 o01Var7;
        o01 o01Var8;
        o01 o01Var9;
        o01 o01Var10;
        o01 o01Var11;
        o01 o01Var12;
        o01 o01Var13;
        o01 o01Var14;
        o01 o01Var15;
        o01 o01Var16;
        o01 o01Var17;
        o01 o01Var18;
        o01 o01Var19;
        o01 o01Var20;
        o01 o01Var21;
        o01 o01Var22;
        o01 o01Var23;
        final int currentAccount = o2Var.getCurrentAccount();
        o01 o01Var24 = new o01(LocaleController.getString(R.string.EditName), 500, 0, new lv0(18, o2Var, o2Var.getResourceProvider()));
        o01 o01Var25 = new o01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var25.a("tg://settings/edit/change-number");
        o01 o01Var26 = new o01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var26.a("tg://settings/edit/add-account");
        o01 o01Var27 = new o01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var27.a("tg://settings/notifications");
        o01 o01Var28 = new o01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var28.a("tg://settings/notifications/private-chats");
        o01 o01Var29 = new o01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01Var29.a("tg://settings/notifications/groups");
        o01 o01Var30 = new o01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ei0(7, o2Var));
        o01Var30.a("tg://settings/notifications/channels");
        o01 o01Var31 = new o01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ei0(19, o2Var));
        o01 o01Var32 = new o01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var33 = new o01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var34 = new o01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ei0(23, o2Var));
        o01Var34.a("tg://settings/notifications/new-contacts");
        o01 o01Var35 = new o01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var35.a("tg://settings/notifications/pinned-messages");
        o01 o01Var36 = new o01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var36.a("tg://settings/notifications/reset");
        o01 o01Var37 = new o01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01 o01Var38 = new o01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01 o01Var39 = new o01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01 o01Var40 = new o01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var40.a("tg://settings/privacy");
        o01 o01Var41 = new o01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var41.a("tg://settings/privacy/2sv");
        o01 o01Var42 = new o01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new u4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(a02.W(), null);
                            wbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ei.kb(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            wbVar.f32176b.setText(spannableStringBuilder);
                            wbVar.f32176b.setSingleLine(false);
                            wbVar.f32176b.setMaxLines(2);
                            a02.b(wbVar, 2750).j();
                            return;
                        }
                        o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        o01Var42.a("tg://settings/privacy/auto-delete");
        o01 o01Var43 = new o01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var43.a("tg://settings/privacy/passcode");
        o01 o01Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            o01Var = o01Var41;
            o01Var2 = new o01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(360928);
                            wb0Var.V(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(360928);
                            wb0Var2.V(128);
                            return;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(360928);
                            wb0Var3.V(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(360928);
                            wb0Var4.V(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            return;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f42984s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                        wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                            return;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            nx0 nx0Var = new nx0();
                            nx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(nx0Var);
                            return;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            o01Var2.a("tg://settings/privacy/login-email");
        } else {
            o01Var = o01Var41;
            o01Var2 = null;
        }
        o01 o01Var45 = new o01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var45.a("tg://settings/privacy/blocked");
        o01 o01Var46 = new o01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var46.a("tg://settings/devices");
        o01 o01Var47 = new o01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var47.a("tg://settings/privacy/phone-number/");
        o01 o01Var48 = new o01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var48.a("tg://settings/privacy/last-seen");
        o01 o01Var49 = new o01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var49.a("tg://settings/privacy/profile-photos");
        o01 o01Var50 = new o01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var50.a("tg://settings/privacy/forwards");
        o01 o01Var51 = new o01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var51.a("tg://settings/privacy/calls/p2p");
        o01 o01Var52 = new o01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var52.a("tg://settings/privacy/calls");
        o01 o01Var53 = new o01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var53.a("tg://settings/privacy/invites");
        o01 o01Var54 = new o01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new u4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(a02.W(), null);
                            wbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ei.kb(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            wbVar.f32176b.setText(spannableStringBuilder);
                            wbVar.f32176b.setSingleLine(false);
                            wbVar.f32176b.setMaxLines(2);
                            a02.b(wbVar, 2750).j();
                            return;
                        }
                        o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        o01Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            o01Var3 = o01Var54;
            o01Var4 = new o01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                o2Var.presentFragment(new hg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            o2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new c7());
                            return;
                        case 24:
                            o2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            o2Var.presentFragment(new c7());
                            return;
                        case 27:
                            o2Var.presentFragment(new c7());
                            return;
                        case 28:
                            o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                            return;
                        default:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            o01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            o01Var3 = o01Var54;
            o01Var4 = null;
        }
        o01 o01Var55 = new o01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var55.a("tg://settings/privacy/self-destruct");
        o01 o01Var56 = new o01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        o01 o01Var57 = new o01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var57.a("tg://settings/privacy/active-websites");
        o01 o01Var58 = new o01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var58.a("tg://settings/privacy/data-settings/delete-synced");
        o01 o01Var59 = new o01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        o01 o01Var60 = new o01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        o01 o01Var61 = new o01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var61.a("tg://settings/privacy/data-settings/map-provider");
        o01 o01Var62 = new o01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var62.a("tg://settings/privacy/data-settings/link-previews");
        o01 o01Var63 = new o01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var63.a("tg://settings/devices");
        o01 o01Var64 = new o01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var64.a("tg://settings/devices/terminate-sessions");
        o01 o01Var65 = new o01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var65.a("tg://settings/devices/link-desktop");
        o01 o01Var66 = new o01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var66.a("tg://settings/privacy/data-settings");
        o01 o01Var67 = new o01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01 o01Var68 = new o01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var68.a("tg://settings/data/storage");
        o01 o01Var69 = new o01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01 o01Var70 = new o01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01 o01Var71 = new o01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01 o01Var72 = new o01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new hg0(i10));
                            return;
                        }
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        o2Var.presentFragment(new c7());
                        return;
                    case 24:
                        o2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        o2Var.presentFragment(new c7());
                        return;
                    case 27:
                        o2Var.presentFragment(new c7());
                        return;
                    case 28:
                        o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                        return;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        o01Var72.a("tg://settings/data/usage");
        o01 o01Var73 = new o01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var74 = new o01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var75 = new o01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var76 = new o01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var77 = new o01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01Var77.a("tg://settings/data/auto-download/reset");
        o01 o01Var78 = new o01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var79 = new o01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var80 = new o01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var81 = new o01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01Var81.a("tg://settings/data/use-less-data");
        o01 o01Var82 = new o01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var83 = new o01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01Var83.a("tg://settings/data/proxy");
        o01 o01Var84 = new o01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        o01 o01Var85 = new o01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01 o01Var86 = new o01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01Var86.a("tg://settings/data/save-to-photos/chats");
        o01 o01Var87 = new o01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        o01Var87.a("tg://settings/data/save-to-photos/groups");
        o01 o01Var88 = new o01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ei0(2, o2Var));
        o01Var88.a("tg://settings/data/save-to-photos/channels");
        o01 o01Var89 = new o01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ei0(3, o2Var));
        o01Var89.a("tg://settings/appearance/themes");
        o01 o01Var90 = new o01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(4, o2Var));
        o01Var90.a("tg://settings/appearance/text-size");
        o01 o01Var91 = new o01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(5, o2Var));
        o01Var91.a("tg://settings/appearance/wallpapers");
        o01 o01Var92 = new o01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ei0(6, o2Var));
        o01 o01Var93 = new o01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ei0(8, o2Var));
        o01 o01Var94 = new o01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(9, o2Var));
        o01 o01Var95 = new o01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(10, o2Var));
        o01 o01Var96 = new o01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ei0(11, o2Var));
        o01Var96.a("tg://settings/appearance/themes/create");
        o01 o01Var97 = new o01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(13, o2Var));
        o01Var97.a("tg://settings/appearance/message-corners");
        o01 o01Var98 = new o01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(14, o2Var));
        o01 o01Var99 = new o01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(15, o2Var));
        o01 o01Var100 = new o01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(16, o2Var));
        o01Var100.a("tg://settings/appearance/app-icon");
        o01 o01Var101 = new o01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(17, o2Var));
        o01 o01Var102 = new o01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(18, o2Var));
        o01Var102.a("tg://settings/appearance/tap-for-next-media");
        o01 o01Var103 = new o01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(20, o2Var));
        o01Var103.a("tg://settings/data/raise-to-listen");
        o01 o01Var104 = new o01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(21, o2Var));
        o01Var104.a("tg://settings/data/raise-to-speak");
        o01 o01Var105 = new o01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(22, o2Var));
        o01Var105.a("tg://settings/data/pause-music");
        o01 o01Var106 = new o01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(24, o2Var));
        o01 o01Var107 = new o01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(25, o2Var));
        o01 o01Var108 = new o01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(26, o2Var));
        o01 o01Var109 = new o01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(27, o2Var));
        o01 o01Var110 = new o01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new ei0(28, o2Var));
        o01Var110.a("tg://settings/appearance/stickers-and-emoji");
        o01 o01Var111 = new o01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new ei0(29, o2Var));
        o01 o01Var112 = new o01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var113 = new o01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var114 = new o01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        o01 o01Var115 = new o01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var116 = new o01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        o01 o01Var117 = new o01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var118 = new o01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        o01 o01Var119 = new o01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        o01 o01Var120 = new o01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var121 = new o01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        o01 o01Var122 = new o01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var122.a("tg://settings/folders");
        o01 o01Var123 = new o01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            o01Var5 = o01Var123;
            o01Var6 = o01Var114;
            o01Var7 = o01Var116;
            o01Var8 = o01Var118;
            o01Var9 = new o01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(360928);
                            wb0Var.V(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(360928);
                            wb0Var2.V(128);
                            return;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(360928);
                            wb0Var3.V(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(360928);
                            wb0Var4.V(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            return;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f42984s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                        wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                            return;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            nx0 nx0Var = new nx0();
                            nx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(nx0Var);
                            return;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            o01Var5 = o01Var123;
            o01Var6 = o01Var114;
            o01Var7 = o01Var116;
            o01Var8 = o01Var118;
            o01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            o01Var10 = new o01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(360928);
                            wb0Var.V(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(360928);
                            wb0Var2.V(128);
                            return;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(360928);
                            wb0Var3.V(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(360928);
                            wb0Var4.V(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            return;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f42984s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                        wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                            return;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            nx0 nx0Var = new nx0();
                            nx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(nx0Var);
                            return;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            o01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            o01Var11 = new o01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(360928);
                            wb0Var.V(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(360928);
                            wb0Var2.V(128);
                            return;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(360928);
                            wb0Var3.V(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(360928);
                            wb0Var4.V(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            return;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f42984s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                        wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                            return;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            nx0 nx0Var = new nx0();
                            nx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(nx0Var);
                            return;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            o01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            o01Var12 = new o01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                o2Var.presentFragment(new hg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            o2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new c7());
                            return;
                        case 24:
                            o2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            o2Var.presentFragment(new c7());
                            return;
                        case 27:
                            o2Var.presentFragment(new c7());
                            return;
                        case 28:
                            o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                            return;
                        default:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            o01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            o01Var13 = new o01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                o2Var.presentFragment(new hg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            o2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new c7());
                            return;
                        case 24:
                            o2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            o2Var.presentFragment(new c7());
                            return;
                        case 27:
                            o2Var.presentFragment(new c7());
                            return;
                        case 28:
                            o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                            return;
                        default:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            o01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            o01Var14 = new o01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                o2Var.presentFragment(new hg0(i10));
                                return;
                            }
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            o2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            o2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            o2Var.presentFragment(new c7());
                            return;
                        case 24:
                            o2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            o2Var.presentFragment(new c7());
                            return;
                        case 27:
                            o2Var.presentFragment(new c7());
                            return;
                        case 28:
                            o2Var.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                            return;
                        default:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            o01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            o01Var15 = new o01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            o2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            o2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            o2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            o2Var.presentFragment(new DataSettingsActivity());
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
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            o2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            o01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            o01Var16 = new o01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            o2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            o2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            o2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            o2Var.presentFragment(new DataSettingsActivity());
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
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            o2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            o2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            o01Var16 = null;
        }
        if (F(currentAccount, 5)) {
            o01Var17 = new o01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ei0(12, o2Var));
        } else {
            o01Var17 = null;
        }
        if (F(currentAccount, 9)) {
            o01Var18 = new o01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new c21());
                            return;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            return;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(28700);
                            return;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(28700);
                            wb0Var5.V(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(28700);
                            wb0Var6.V(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(28700);
                            wb0Var7.V(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(360928);
                            wb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o01Var18 = null;
        }
        if (F(currentAccount, 6)) {
            o01Var19 = new o01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new c21());
                            return;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            return;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(28700);
                            return;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(28700);
                            wb0Var5.V(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(28700);
                            wb0Var6.V(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(28700);
                            wb0Var7.V(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(360928);
                            wb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o01Var19 = null;
        }
        if (F(currentAccount, 7)) {
            o01Var20 = new o01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new c21());
                            return;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            return;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(28700);
                            return;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(28700);
                            wb0Var5.V(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(28700);
                            wb0Var6.V(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(28700);
                            wb0Var7.V(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(360928);
                            wb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o01Var20 = null;
        }
        if (F(currentAccount, 10)) {
            o01Var21 = new o01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new c21());
                            return;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            return;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(28700);
                            return;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(28700);
                            wb0Var5.V(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(28700);
                            wb0Var6.V(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(28700);
                            wb0Var7.V(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(360928);
                            wb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o01Var21 = null;
        }
        if (F(currentAccount, 12)) {
            o01Var22 = new o01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            o2Var.presentFragment(new c21());
                            return;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            return;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(28700);
                            return;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(28700);
                            wb0Var5.V(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(28700);
                            wb0Var6.V(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(28700);
                            wb0Var7.V(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(360928);
                            wb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            o01Var22 = null;
        }
        o01 o01Var124 = new o01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var124.a("tg://settings/power-saving");
        o01 o01Var125 = new o01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var125.a("tg://settings/power-saving/stickers");
        o01 o01Var126 = new o01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var127 = new o01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var128 = new o01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var128.a("tg://settings/power-saving/emoji");
        o01 o01Var129 = new o01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var130 = new o01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var131 = new o01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01 o01Var132 = new o01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var132.a("tg://settings/power-saving/effects");
        o01 o01Var133 = new o01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        o2Var.presentFragment(new c21());
                        return;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        return;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(28700);
                        return;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(28700);
                        wb0Var5.V(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(28700);
                        wb0Var6.V(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(28700);
                        wb0Var7.V(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(360928);
                        wb0Var9.V(32);
                        return;
                }
            }
        });
        o01Var133.a("tg://settings/power-saving/background");
        o01 o01Var134 = new o01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01 o01Var135 = new o01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            o01Var23 = new o01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(360928);
                            wb0Var.V(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(360928);
                            wb0Var2.V(128);
                            return;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(360928);
                            wb0Var3.V(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(360928);
                            wb0Var4.V(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            return;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f42984s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                        wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                            return;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            nx0 nx0Var = new nx0();
                            nx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(nx0Var);
                            return;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            o01Var23 = null;
        }
        o01 o01Var136 = new o01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01 o01Var137 = new o01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var137.a("tg://settings/power-saving/call-animations");
        o01 o01Var138 = new o01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var138.a("tg://settings/power-saving/videos");
        o01 o01Var139 = new o01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var139.a("tg://settings/power-saving/gifs");
        o01 o01Var140 = new o01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var140.a("tg://settings/power-saving/transitions");
        o01 o01Var141 = new o01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var141.a("tg://settings/language");
        o01 o01Var142 = new o01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            o01 o01Var143 = new o01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(360928);
                            wb0Var.V(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(360928);
                            wb0Var2.V(128);
                            return;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(360928);
                            wb0Var3.V(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(360928);
                            wb0Var4.V(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            return;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f42984s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                        wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                            return;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            nx0 nx0Var = new nx0();
                            nx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(nx0Var);
                            return;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            o01Var143.a("tg://settings/language/do-not-translate");
            o01Var44 = o01Var143;
        }
        o01 o01Var144 = new o01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var144.a("tg://settings/ask-question");
        o01 o01Var145 = new o01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var145.a("tg://settings/faq");
        o01 o01Var146 = new o01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(360928);
                        wb0Var.V(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(360928);
                        wb0Var2.V(128);
                        return;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(360928);
                        wb0Var3.V(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(360928);
                        wb0Var4.V(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        return;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f42984s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40763f == 1) {
                                    wb0Var8.f42979b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.d5.T(o2Var3, null));
                        return;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        nx0 nx0Var = new nx0();
                        nx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(nx0Var);
                        return;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        o01Var146.a("tg://settings/privacy-policy");
        return new o01[]{o01Var24, o01Var25, o01Var26, o01Var27, o01Var28, o01Var29, o01Var30, o01Var31, o01Var32, o01Var33, o01Var34, o01Var35, o01Var36, o01Var37, o01Var38, o01Var39, o01Var40, o01Var, o01Var42, o01Var43, o01Var2, o01Var45, o01Var46, o01Var47, o01Var48, o01Var49, o01Var50, o01Var51, o01Var52, o01Var53, o01Var3, o01Var4, o01Var55, o01Var56, o01Var57, o01Var58, o01Var59, o01Var60, o01Var61, o01Var62, o01Var63, o01Var64, o01Var65, o01Var66, o01Var67, o01Var68, o01Var69, o01Var70, o01Var71, o01Var72, o01Var73, o01Var74, o01Var75, o01Var76, o01Var77, o01Var78, o01Var79, o01Var80, o01Var81, o01Var82, o01Var83, o01Var84, o01Var85, o01Var86, o01Var87, o01Var88, o01Var89, o01Var90, o01Var91, o01Var92, o01Var93, o01Var94, o01Var95, o01Var96, o01Var97, o01Var98, o01Var99, o01Var100, o01Var101, o01Var102, o01Var103, o01Var104, o01Var105, o01Var106, o01Var107, o01Var108, o01Var109, o01Var110, o01Var111, o01Var112, o01Var113, o01Var6, o01Var115, o01Var7, o01Var117, o01Var8, o01Var119, o01Var120, o01Var121, o01Var122, o01Var5, o01Var9, o01Var10, o01Var11, o01Var12, o01Var13, o01Var14, o01Var15, o01Var16, o01Var17, o01Var18, o01Var19, o01Var20, o01Var21, o01Var22, o01Var124, o01Var125, o01Var126, o01Var127, o01Var128, o01Var129, o01Var130, o01Var131, o01Var132, o01Var133, o01Var134, o01Var135, o01Var23, o01Var136, o01Var137, o01Var138, o01Var139, o01Var140, o01Var141, o01Var142, o01Var44, o01Var144, o01Var145, o01Var146};
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 0) {
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
        if (!this.f40307w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof o01) {
                ((o01) obj2).f40054g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f40303f;
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new l(this, 21));
        }
    }

    public final void I(String str) {
        this.f40309y = str;
        if (this.f40308x != null) {
            Utilities.searchQueue.cancelRunnable(this.f40308x);
            this.f40308x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f40307w = false;
            this.f40305r.clear();
            this.f40306s.clear();
            this.f40304n.clear();
            org.telegram.ui.ActionBar.o2 o2Var = this.e;
            if (o2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) o2Var).P.f32067b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        lv0 lv0Var = new lv0(19, this, str);
        this.f40308x = lv0Var;
        dispatchQueue2.postRunnable(lv0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        o01 o01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            o01[] o01VarArr = this.f40302c;
            if (i10 >= o01VarArr.length) {
                break;
            }
            o01 o01Var2 = o01VarArr[i10];
            if (o01Var2 != null) {
                hashMap.put(Integer.valueOf(o01Var2.f40053f), this.f40302c[i10]);
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
                    } else if (readInt322 == 1 && (o01Var = (o01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        o01Var.f40054g = readInt32;
                        arrayList.add(o01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new o70(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f40307w) {
            int size2 = this.f40305r.size();
            if (!this.f40306s.isEmpty()) {
                i10 = this.f40306s.size() + 1;
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
        if (this.f40307w) {
            if (i10 < this.f40305r.size() || i10 != this.f40305r.size()) {
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
        o01 o01Var;
        int i11;
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
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
        org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
        boolean z11 = false;
        if (this.f40307w) {
            if (i10 < this.f40305r.size()) {
                o01 o01Var2 = (o01) this.f40305r.get(i10);
                if (i10 > 0) {
                    o01Var = (o01) this.f40305r.get(i10 - 1);
                } else {
                    o01Var = null;
                }
                if (o01Var != null && o01Var.e == o01Var2.e) {
                    i11 = 0;
                } else {
                    i11 = o01Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f40304n.get(i10);
                String[] strArr = o01Var2.d;
                if (i10 >= this.f40305r.size() - 1) {
                    z10 = false;
                }
                y6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.f40305r);
            CharSequence charSequence2 = (CharSequence) this.f40304n.get(this.f40305r.size() + g10);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f40306s.get(g10)).path;
            if (g10 < this.f40305r.size() - 1) {
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
            if (obj instanceof o01) {
                o01 o01Var3 = (o01) obj;
                String str = o01Var3.f40050a;
                String[] strArr3 = o01Var3.d;
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
                y6Var = new org.telegram.ui.Cells.l4(context, 16);
            } else {
                y6Var = new org.telegram.ui.Cells.u3(context, null);
            }
        } else {
            y6Var = new org.telegram.ui.Cells.y6(context);
        }
        y6Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(y6Var);
    }
}
