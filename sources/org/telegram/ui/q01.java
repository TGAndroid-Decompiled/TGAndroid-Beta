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
public class q01 extends org.telegram.ui.Components.lm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public p01[] f40595c;
    public final org.telegram.ui.ActionBar.o2 e;
    public final int f40596f;
    public final Context h;
    public boolean f40600w;
    public mv0 f40601x;
    public String f40602y;
    public final ArrayList d = new ArrayList();
    public ArrayList f40597n = new ArrayList();
    public ArrayList f40598r = new ArrayList();
    public ArrayList f40599s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public q01(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.e = o2Var;
        this.f40596f = o2Var.getCurrentAccount();
        this.h = context;
        this.f40595c = H(o2Var);
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

    public static p01[] H(final org.telegram.ui.ActionBar.o2 o2Var) {
        p01 p01Var;
        p01 p01Var2;
        p01 p01Var3;
        p01 p01Var4;
        p01 p01Var5;
        p01 p01Var6;
        p01 p01Var7;
        p01 p01Var8;
        p01 p01Var9;
        p01 p01Var10;
        p01 p01Var11;
        p01 p01Var12;
        p01 p01Var13;
        p01 p01Var14;
        p01 p01Var15;
        p01 p01Var16;
        p01 p01Var17;
        p01 p01Var18;
        p01 p01Var19;
        p01 p01Var20;
        p01 p01Var21;
        p01 p01Var22;
        p01 p01Var23;
        final int currentAccount = o2Var.getCurrentAccount();
        p01 p01Var24 = new p01(LocaleController.getString(R.string.EditName), 500, 0, new mv0(18, o2Var, o2Var.getResourceProvider()));
        p01 p01Var25 = new p01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var25.a("tg://settings/edit/change-number");
        p01 p01Var26 = new p01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var26.a("tg://settings/edit/add-account");
        p01 p01Var27 = new p01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var27.a("tg://settings/notifications");
        p01 p01Var28 = new p01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var28.a("tg://settings/notifications/private-chats");
        p01 p01Var29 = new p01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
        p01Var29.a("tg://settings/notifications/groups");
        p01 p01Var30 = new p01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new fi0(7, o2Var));
        p01Var30.a("tg://settings/notifications/channels");
        p01 p01Var31 = new p01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new fi0(19, o2Var));
        p01 p01Var32 = new p01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var33 = new p01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var34 = new p01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new fi0(23, o2Var));
        p01Var34.a("tg://settings/notifications/new-contacts");
        p01 p01Var35 = new p01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var35.a("tg://settings/notifications/pinned-messages");
        p01 p01Var36 = new p01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var36.a("tg://settings/notifications/reset");
        p01 p01Var37 = new p01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01 p01Var38 = new p01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01 p01Var39 = new p01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01 p01Var40 = new p01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var40.a("tg://settings/privacy");
        p01 p01Var41 = new p01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var41.a("tg://settings/privacy/2sv");
        p01 p01Var42 = new p01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(o2Var2);
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
                            ybVar.f32863b.setText(spannableStringBuilder);
                            ybVar.f32863b.setSingleLine(false);
                            ybVar.f32863b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        p01Var42.a("tg://settings/privacy/auto-delete");
        p01 p01Var43 = new p01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var43.a("tg://settings/privacy/passcode");
        p01 p01Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            p01Var = p01Var41;
            p01Var2 = new p01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                                ArrayList arrayList = wb0Var8.f42999s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                        wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
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
            p01Var2.a("tg://settings/privacy/login-email");
        } else {
            p01Var = p01Var41;
            p01Var2 = null;
        }
        p01 p01Var45 = new p01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var45.a("tg://settings/privacy/blocked");
        p01 p01Var46 = new p01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var46.a("tg://settings/devices");
        p01 p01Var47 = new p01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var47.a("tg://settings/privacy/phone-number/");
        p01 p01Var48 = new p01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var48.a("tg://settings/privacy/last-seen");
        p01 p01Var49 = new p01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var49.a("tg://settings/privacy/profile-photos");
        p01 p01Var50 = new p01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var50.a("tg://settings/privacy/forwards");
        p01 p01Var51 = new p01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var51.a("tg://settings/privacy/calls/p2p");
        p01 p01Var52 = new p01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var52.a("tg://settings/privacy/calls");
        p01 p01Var53 = new p01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var53.a("tg://settings/privacy/invites");
        p01 p01Var54 = new p01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(o2Var2);
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
                            ybVar.f32863b.setText(spannableStringBuilder);
                            ybVar.f32863b.setSingleLine(false);
                            ybVar.f32863b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        p01Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            p01Var3 = p01Var54;
            p01Var4 = new p01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                                o2Var.presentFragment(new ig0(i10));
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
            p01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            p01Var3 = p01Var54;
            p01Var4 = null;
        }
        p01 p01Var55 = new p01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var55.a("tg://settings/privacy/self-destruct");
        p01 p01Var56 = new p01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        p01 p01Var57 = new p01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var57.a("tg://settings/privacy/active-websites");
        p01 p01Var58 = new p01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var58.a("tg://settings/privacy/data-settings/delete-synced");
        p01 p01Var59 = new p01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        p01 p01Var60 = new p01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        p01 p01Var61 = new p01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var61.a("tg://settings/privacy/data-settings/map-provider");
        p01 p01Var62 = new p01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var62.a("tg://settings/privacy/data-settings/link-previews");
        p01 p01Var63 = new p01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var63.a("tg://settings/devices");
        p01 p01Var64 = new p01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var64.a("tg://settings/devices/terminate-sessions");
        p01 p01Var65 = new p01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var65.a("tg://settings/devices/link-desktop");
        p01 p01Var66 = new p01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var66.a("tg://settings/privacy/data-settings");
        p01 p01Var67 = new p01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01 p01Var68 = new p01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var68.a("tg://settings/data/storage");
        p01 p01Var69 = new p01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01 p01Var70 = new p01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01 p01Var71 = new p01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01 p01Var72 = new p01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                            o2Var.presentFragment(new ig0(i10));
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
        p01Var72.a("tg://settings/data/usage");
        p01 p01Var73 = new p01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var74 = new p01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var75 = new p01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var76 = new p01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var77 = new p01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01Var77.a("tg://settings/data/auto-download/reset");
        p01 p01Var78 = new p01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var79 = new p01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var80 = new p01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var81 = new p01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01Var81.a("tg://settings/data/use-less-data");
        p01 p01Var82 = new p01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var83 = new p01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01Var83.a("tg://settings/data/proxy");
        p01 p01Var84 = new p01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        p01 p01Var85 = new p01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        p01 p01Var86 = new p01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
        p01Var86.a("tg://settings/data/save-to-photos/chats");
        p01 p01Var87 = new p01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
        p01Var87.a("tg://settings/data/save-to-photos/groups");
        p01 p01Var88 = new p01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new fi0(2, o2Var));
        p01Var88.a("tg://settings/data/save-to-photos/channels");
        p01 p01Var89 = new p01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new fi0(3, o2Var));
        p01Var89.a("tg://settings/appearance/themes");
        p01 p01Var90 = new p01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(4, o2Var));
        p01Var90.a("tg://settings/appearance/text-size");
        p01 p01Var91 = new p01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(5, o2Var));
        p01Var91.a("tg://settings/appearance/wallpapers");
        p01 p01Var92 = new p01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new fi0(6, o2Var));
        p01 p01Var93 = new p01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new fi0(8, o2Var));
        p01 p01Var94 = new p01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(9, o2Var));
        p01 p01Var95 = new p01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(10, o2Var));
        p01 p01Var96 = new p01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new fi0(11, o2Var));
        p01Var96.a("tg://settings/appearance/themes/create");
        p01 p01Var97 = new p01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(13, o2Var));
        p01Var97.a("tg://settings/appearance/message-corners");
        p01 p01Var98 = new p01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(14, o2Var));
        p01 p01Var99 = new p01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(15, o2Var));
        p01 p01Var100 = new p01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(16, o2Var));
        p01Var100.a("tg://settings/appearance/app-icon");
        p01 p01Var101 = new p01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(17, o2Var));
        p01 p01Var102 = new p01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(18, o2Var));
        p01Var102.a("tg://settings/appearance/tap-for-next-media");
        p01 p01Var103 = new p01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(20, o2Var));
        p01Var103.a("tg://settings/data/raise-to-listen");
        p01 p01Var104 = new p01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(21, o2Var));
        p01Var104.a("tg://settings/data/raise-to-speak");
        p01 p01Var105 = new p01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(22, o2Var));
        p01Var105.a("tg://settings/data/pause-music");
        p01 p01Var106 = new p01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(24, o2Var));
        p01 p01Var107 = new p01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(25, o2Var));
        p01 p01Var108 = new p01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(26, o2Var));
        p01 p01Var109 = new p01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(27, o2Var));
        p01 p01Var110 = new p01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new fi0(28, o2Var));
        p01Var110.a("tg://settings/appearance/stickers-and-emoji");
        p01 p01Var111 = new p01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new fi0(29, o2Var));
        p01 p01Var112 = new p01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var113 = new p01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var114 = new p01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        p01 p01Var115 = new p01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var116 = new p01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        p01 p01Var117 = new p01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var118 = new p01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        p01 p01Var119 = new p01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        p01 p01Var120 = new p01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var121 = new p01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        p01 p01Var122 = new p01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var122.a("tg://settings/folders");
        p01 p01Var123 = new p01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            p01Var5 = p01Var123;
            p01Var6 = p01Var114;
            p01Var7 = p01Var116;
            p01Var8 = p01Var118;
            p01Var9 = new p01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
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
                                ArrayList arrayList = wb0Var8.f42999s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                        wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
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
            p01Var5 = p01Var123;
            p01Var6 = p01Var114;
            p01Var7 = p01Var116;
            p01Var8 = p01Var118;
            p01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            p01Var10 = new p01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                ArrayList arrayList = wb0Var8.f42999s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                        wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
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
            p01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            p01Var11 = new p01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                ArrayList arrayList = wb0Var8.f42999s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                        wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
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
            p01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            p01Var12 = new p01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                o2Var.presentFragment(new ig0(i10));
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
            p01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            p01Var13 = new p01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                o2Var.presentFragment(new ig0(i10));
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
            p01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            p01Var14 = new p01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                o2Var.presentFragment(new ig0(i10));
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
            p01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            p01Var15 = new p01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            p01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            p01Var16 = new p01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            p01Var16 = null;
        }
        if (F(currentAccount, 5)) {
            p01Var17 = new p01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new fi0(12, o2Var));
        } else {
            p01Var17 = null;
        }
        if (F(currentAccount, 9)) {
            p01Var18 = new p01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            o2Var.presentFragment(new d21());
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
            p01Var18 = null;
        }
        if (F(currentAccount, 6)) {
            p01Var19 = new p01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            o2Var.presentFragment(new d21());
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
            p01Var19 = null;
        }
        if (F(currentAccount, 7)) {
            p01Var20 = new p01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            o2Var.presentFragment(new d21());
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
            p01Var20 = null;
        }
        if (F(currentAccount, 10)) {
            p01Var21 = new p01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            o2Var.presentFragment(new d21());
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
            p01Var21 = null;
        }
        if (F(currentAccount, 12)) {
            p01Var22 = new p01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            o2Var.presentFragment(new d21());
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
            p01Var22 = null;
        }
        p01 p01Var124 = new p01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var124.a("tg://settings/power-saving");
        p01 p01Var125 = new p01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var125.a("tg://settings/power-saving/stickers");
        p01 p01Var126 = new p01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var127 = new p01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var128 = new p01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var128.a("tg://settings/power-saving/emoji");
        p01 p01Var129 = new p01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var130 = new p01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var131 = new p01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01 p01Var132 = new p01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var132.a("tg://settings/power-saving/effects");
        p01 p01Var133 = new p01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                        o2Var.presentFragment(new d21());
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
        p01Var133.a("tg://settings/power-saving/background");
        p01 p01Var134 = new p01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01 p01Var135 = new p01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
            p01Var23 = new p01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                                ArrayList arrayList = wb0Var8.f42999s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                        wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
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
            p01Var23 = null;
        }
        p01 p01Var136 = new p01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01 p01Var137 = new p01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var137.a("tg://settings/power-saving/call-animations");
        p01 p01Var138 = new p01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var138.a("tg://settings/power-saving/videos");
        p01 p01Var139 = new p01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var139.a("tg://settings/power-saving/gifs");
        p01 p01Var140 = new p01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var140.a("tg://settings/power-saving/transitions");
        p01 p01Var141 = new p01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var141.a("tg://settings/language");
        p01 p01Var142 = new p01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            p01 p01Var143 = new p01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
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
                                ArrayList arrayList = wb0Var8.f42999s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                        wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
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
            p01Var143.a("tg://settings/language/do-not-translate");
            p01Var44 = p01Var143;
        }
        p01 p01Var144 = new p01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var144.a("tg://settings/ask-question");
        p01 p01Var145 = new p01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var145.a("tg://settings/faq");
        p01 p01Var146 = new p01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
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
                            ArrayList arrayList = wb0Var8.f42999s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f40690f == 1) {
                                    wb0Var8.f42994b.f1(new i2.r(wb0Var8, i10, 13), 700, true);
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
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
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
        p01Var146.a("tg://settings/privacy-policy");
        return new p01[]{p01Var24, p01Var25, p01Var26, p01Var27, p01Var28, p01Var29, p01Var30, p01Var31, p01Var32, p01Var33, p01Var34, p01Var35, p01Var36, p01Var37, p01Var38, p01Var39, p01Var40, p01Var, p01Var42, p01Var43, p01Var2, p01Var45, p01Var46, p01Var47, p01Var48, p01Var49, p01Var50, p01Var51, p01Var52, p01Var53, p01Var3, p01Var4, p01Var55, p01Var56, p01Var57, p01Var58, p01Var59, p01Var60, p01Var61, p01Var62, p01Var63, p01Var64, p01Var65, p01Var66, p01Var67, p01Var68, p01Var69, p01Var70, p01Var71, p01Var72, p01Var73, p01Var74, p01Var75, p01Var76, p01Var77, p01Var78, p01Var79, p01Var80, p01Var81, p01Var82, p01Var83, p01Var84, p01Var85, p01Var86, p01Var87, p01Var88, p01Var89, p01Var90, p01Var91, p01Var92, p01Var93, p01Var94, p01Var95, p01Var96, p01Var97, p01Var98, p01Var99, p01Var100, p01Var101, p01Var102, p01Var103, p01Var104, p01Var105, p01Var106, p01Var107, p01Var108, p01Var109, p01Var110, p01Var111, p01Var112, p01Var113, p01Var6, p01Var115, p01Var7, p01Var117, p01Var8, p01Var119, p01Var120, p01Var121, p01Var122, p01Var5, p01Var9, p01Var10, p01Var11, p01Var12, p01Var13, p01Var14, p01Var15, p01Var16, p01Var17, p01Var18, p01Var19, p01Var20, p01Var21, p01Var22, p01Var124, p01Var125, p01Var126, p01Var127, p01Var128, p01Var129, p01Var130, p01Var131, p01Var132, p01Var133, p01Var134, p01Var135, p01Var23, p01Var136, p01Var137, p01Var138, p01Var139, p01Var140, p01Var141, p01Var142, p01Var44, p01Var144, p01Var145, p01Var146};
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f == 0) {
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
        if (!this.f40600w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof p01) {
                ((p01) obj2).f40327g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f40596f;
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
        this.f40602y = str;
        if (this.f40601x != null) {
            Utilities.searchQueue.cancelRunnable(this.f40601x);
            this.f40601x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f40600w = false;
            this.f40598r.clear();
            this.f40599s.clear();
            this.f40597n.clear();
            org.telegram.ui.ActionBar.o2 o2Var = this.e;
            if (o2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) o2Var).P.f32371b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        mv0 mv0Var = new mv0(19, this, str);
        this.f40601x = mv0Var;
        dispatchQueue.postRunnable(mv0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        p01 p01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            p01[] p01VarArr = this.f40595c;
            if (i10 >= p01VarArr.length) {
                break;
            }
            p01 p01Var2 = p01VarArr[i10];
            if (p01Var2 != null) {
                hashMap.put(Integer.valueOf(p01Var2.f40326f), this.f40595c[i10]);
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
                    } else if (readInt322 == 1 && (p01Var = (p01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        p01Var.f40327g = readInt32;
                        arrayList.add(p01Var);
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
        if (this.f40600w) {
            int size2 = this.f40598r.size();
            if (!this.f40599s.isEmpty()) {
                i10 = this.f40599s.size() + 1;
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
        if (this.f40600w) {
            if (i10 < this.f40598r.size() || i10 != this.f40598r.size()) {
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
        p01 p01Var;
        int i11;
        int i12 = b1Var.f46346f;
        View view = b1Var.f46343a;
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
        if (this.f40600w) {
            if (i10 < this.f40598r.size()) {
                p01 p01Var2 = (p01) this.f40598r.get(i10);
                if (i10 > 0) {
                    p01Var = (p01) this.f40598r.get(i10 - 1);
                } else {
                    p01Var = null;
                }
                if (p01Var != null && p01Var.e == p01Var2.e) {
                    i11 = 0;
                } else {
                    i11 = p01Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f40597n.get(i10);
                String[] strArr = p01Var2.d;
                if (i10 >= this.f40598r.size() - 1) {
                    z10 = false;
                }
                y6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.f40598r);
            CharSequence charSequence2 = (CharSequence) this.f40597n.get(this.f40598r.size() + g10);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f40599s.get(g10)).path;
            if (g10 < this.f40598r.size() - 1) {
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
            if (obj instanceof p01) {
                p01 p01Var3 = (p01) obj;
                String str = p01Var3.f40323a;
                String[] strArr3 = p01Var3.d;
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
