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
public class f01 extends org.telegram.ui.Components.vk0 {
    public TLRPC.WebPage A;
    public boolean B;
    public e01[] f38064c;
    public final org.telegram.ui.ActionBar.o2 f38065e;
    public final int f38066f;
    public final Context h;
    public boolean f38070w;
    public ys0 f38071x;
    public String f38072y;
    public final ArrayList d = new ArrayList();
    public ArrayList f38067n = new ArrayList();
    public ArrayList f38068r = new ArrayList();
    public ArrayList f38069s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public f01(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f38065e = o2Var;
        this.f38066f = o2Var.getCurrentAccount();
        this.h = context;
        this.f38064c = H(o2Var);
        J();
    }

    public static boolean F(int i9, int i10) {
        if (MessagesController.getInstance(i9).premiumFeaturesBlocked() && !UserConfig.getInstance(i9).isPremium()) {
            return false;
        }
        if (i10 != -1 && MessagesController.getInstance(i9).premiumFeaturesTypesToPosition.get(i10, -1) == -1) {
            return false;
        }
        return true;
    }

    public static e01[] H(final org.telegram.ui.ActionBar.o2 o2Var) {
        e01 e01Var;
        e01 e01Var2;
        e01 e01Var3;
        e01 e01Var4;
        e01 e01Var5;
        e01 e01Var6;
        e01 e01Var7;
        e01 e01Var8;
        e01 e01Var9;
        e01 e01Var10;
        e01 e01Var11;
        e01 e01Var12;
        e01 e01Var13;
        e01 e01Var14;
        e01 e01Var15;
        e01 e01Var16;
        e01 e01Var17;
        e01 e01Var18;
        e01 e01Var19;
        e01 e01Var20;
        e01 e01Var21;
        e01 e01Var22;
        final int currentAccount = o2Var.getCurrentAccount();
        e01 e01Var23 = new e01(LocaleController.getString(R.string.EditName), 500, 0, new ys0(22, o2Var, o2Var.getResourceProvider()));
        e01 e01Var24 = new e01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var24.a("tg://settings/edit/change-number");
        e01 e01Var25 = new e01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var25.a("tg://settings/edit/add-account");
        e01 e01Var26 = new e01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var26.a("tg://settings/notifications");
        e01 e01Var27 = new e01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01Var27.a("tg://settings/notifications/private-chats");
        e01 e01Var28 = new e01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01Var28.a("tg://settings/notifications/groups");
        e01 e01Var29 = new e01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ai0(8, o2Var));
        e01Var29.a("tg://settings/notifications/channels");
        e01 e01Var30 = new e01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ai0(20, o2Var));
        e01 e01Var31 = new e01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var32 = new e01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var33 = new e01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ai0(23, o2Var));
        e01Var33.a("tg://settings/notifications/new-contacts");
        e01 e01Var34 = new e01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var34.a("tg://settings/notifications/pinned-messages");
        e01 e01Var35 = new e01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var35.a("tg://settings/notifications/reset");
        e01 e01Var36 = new e01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01 e01Var37 = new e01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01 e01Var38 = new e01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01 e01Var39 = new e01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var39.a("tg://settings/privacy");
        e01 e01Var40 = new e01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var40.a("tg://settings/privacy/2sv");
        e01 e01Var41 = new e01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a02.W(), null);
                            obVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new kh.lb(a02, 4), indexOf, lastIndexOf - 1, 33);
                            }
                            obVar.f31343b.setText(spannableStringBuilder);
                            obVar.f31343b.setSingleLine(false);
                            obVar.f31343b.setMaxLines(2);
                            a02.b(obVar, 2750).j();
                            return;
                        }
                        o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        e01Var41.a("tg://settings/privacy/auto-delete");
        e01 e01Var42 = new e01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var42.a("tg://settings/privacy/passcode");
        e01 e01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            e01Var = e01Var40;
            e01Var2 = new e01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(360928);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(360928);
                            sb0Var2.U(32);
                            return;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(360928);
                            sb0Var3.U(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(360928);
                            sb0Var4.U(128);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(360928);
                            sb0Var5.U(256);
                            return;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(360928);
                            sb0Var6.U(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            return;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            return;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i9 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.f42656s;
                                if (i9 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                        sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                        return;
                                    }
                                    i9++;
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
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            return;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            return;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            e01Var2.a("tg://settings/privacy/login-email");
        } else {
            e01Var = e01Var40;
            e01Var2 = null;
        }
        e01 e01Var44 = new e01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var44.a("tg://settings/privacy/blocked");
        e01 e01Var45 = new e01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var45.a("tg://settings/devices");
        e01 e01Var46 = new e01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var46.a("tg://settings/privacy/phone-number/");
        e01 e01Var47 = new e01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var47.a("tg://settings/privacy/last-seen");
        e01 e01Var48 = new e01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var48.a("tg://settings/privacy/profile-photos");
        e01 e01Var49 = new e01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var49.a("tg://settings/privacy/forwards");
        e01 e01Var50 = new e01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var50.a("tg://settings/privacy/calls/p2p");
        e01 e01Var51 = new e01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var51.a("tg://settings/privacy/calls");
        e01 e01Var52 = new e01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var52.a("tg://settings/privacy/invites");
        e01 e01Var53 = new e01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a02.W(), null);
                            obVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new kh.lb(a02, 4), indexOf, lastIndexOf - 1, 33);
                            }
                            obVar.f31343b.setText(spannableStringBuilder);
                            obVar.f31343b.setSingleLine(false);
                            obVar.f31343b.setMaxLines(2);
                            a02.b(obVar, 2750).j();
                            return;
                        }
                        o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        e01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            e01Var3 = new e01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
                            int i9 = 0;
                            while (true) {
                                if (i9 < 4) {
                                    if (UserConfig.getInstance(i9).isClientActivated()) {
                                        i9++;
                                    }
                                } else {
                                    i9 = -1;
                                }
                            }
                            if (i9 >= 0) {
                                o2Var.presentFragment(new fg0(i9));
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
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
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
                            o2Var.presentFragment(new y6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 27:
                            o2Var.presentFragment(new y6());
                            return;
                        case 28:
                            o2Var.presentFragment(new y6());
                            return;
                        default:
                            o2Var.presentFragment(new y6());
                            return;
                    }
                }
            });
            e01Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            e01Var3 = null;
        }
        e01 e01Var54 = new e01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var54.a("tg://settings/privacy/self-destruct");
        e01 e01Var55 = new e01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        e01 e01Var56 = new e01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var56.a("tg://settings/privacy/active-websites");
        e01 e01Var57 = new e01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        e01 e01Var58 = new e01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        e01 e01Var59 = new e01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        e01 e01Var60 = new e01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var60.a("tg://settings/privacy/data-settings/map-provider");
        e01 e01Var61 = new e01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var61.a("tg://settings/privacy/data-settings/link-previews");
        e01 e01Var62 = new e01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var62.a("tg://settings/devices");
        e01 e01Var63 = new e01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var63.a("tg://settings/devices/terminate-sessions");
        e01 e01Var64 = new e01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var64.a("tg://settings/devices/link-desktop");
        e01 e01Var65 = new e01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var65.a("tg://settings/privacy/data-settings");
        e01 e01Var66 = new e01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01 e01Var67 = new e01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01Var67.a("tg://settings/data/storage");
        e01 e01Var68 = new e01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01 e01Var69 = new e01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01 e01Var70 = new e01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i9 = 0;
                        while (true) {
                            if (i9 < 4) {
                                if (UserConfig.getInstance(i9).isClientActivated()) {
                                    i9++;
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                        if (i9 >= 0) {
                            o2Var.presentFragment(new fg0(i9));
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
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
                        o2Var.presentFragment(new y6());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 27:
                        o2Var.presentFragment(new y6());
                        return;
                    case 28:
                        o2Var.presentFragment(new y6());
                        return;
                    default:
                        o2Var.presentFragment(new y6());
                        return;
                }
            }
        });
        e01 e01Var71 = new e01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01Var71.a("tg://settings/data/usage");
        e01 e01Var72 = new e01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var73 = new e01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var74 = new e01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var75 = new e01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var76 = new e01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01Var76.a("tg://settings/data/auto-download/reset");
        e01 e01Var77 = new e01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var78 = new e01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var79 = new e01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var80 = new e01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01Var80.a("tg://settings/data/use-less-data");
        e01 e01Var81 = new e01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var82 = new e01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01Var82.a("tg://settings/data/proxy");
        e01 e01Var83 = new e01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01Var83.a("tg://settings/data/proxy/use-for-calls");
        e01 e01Var84 = new e01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        e01 e01Var85 = new e01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
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
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        e01 e01Var86 = new e01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ai0(2, o2Var));
        e01Var86.a("tg://settings/data/save-to-photos/chats");
        e01 e01Var87 = new e01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ai0(3, o2Var));
        e01Var87.a("tg://settings/data/save-to-photos/groups");
        e01 e01Var88 = new e01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ai0(4, o2Var));
        e01Var88.a("tg://settings/data/save-to-photos/channels");
        e01 e01Var89 = new e01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ai0(5, o2Var));
        e01Var89.a("tg://settings/appearance/themes");
        e01 e01Var90 = new e01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(6, o2Var));
        e01Var90.a("tg://settings/appearance/text-size");
        e01 e01Var91 = new e01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(7, o2Var));
        e01Var91.a("tg://settings/appearance/wallpapers");
        e01 e01Var92 = new e01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ai0(9, o2Var));
        e01 e01Var93 = new e01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ai0(10, o2Var));
        e01 e01Var94 = new e01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(11, o2Var));
        e01 e01Var95 = new e01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(13, o2Var));
        e01 e01Var96 = new e01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ai0(14, o2Var));
        e01Var96.a("tg://settings/appearance/themes/create");
        e01 e01Var97 = new e01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(15, o2Var));
        e01Var97.a("tg://settings/appearance/message-corners");
        e01 e01Var98 = new e01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(16, o2Var));
        e01 e01Var99 = new e01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(17, o2Var));
        e01 e01Var100 = new e01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(18, o2Var));
        e01Var100.a("tg://settings/appearance/app-icon");
        e01 e01Var101 = new e01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(19, o2Var));
        e01 e01Var102 = new e01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(21, o2Var));
        e01Var102.a("tg://settings/appearance/tap-for-next-media");
        e01 e01Var103 = new e01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(22, o2Var));
        e01Var103.a("tg://settings/data/raise-to-listen");
        e01 e01Var104 = new e01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(24, o2Var));
        e01Var104.a("tg://settings/data/raise-to-speak");
        e01 e01Var105 = new e01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(25, o2Var));
        e01Var105.a("tg://settings/data/pause-music");
        e01 e01Var106 = new e01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(26, o2Var));
        e01 e01Var107 = new e01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(27, o2Var));
        e01 e01Var108 = new e01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(28, o2Var));
        e01 e01Var109 = new e01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(29, o2Var));
        e01 e01Var110 = new e01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var110.a("tg://settings/appearance/stickers-and-emoji");
        e01 e01Var111 = new e01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var112 = new e01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var113 = new e01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var114 = new e01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        e01 e01Var115 = new e01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var116 = new e01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        e01 e01Var117 = new e01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var118 = new e01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        e01 e01Var119 = new e01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        e01 e01Var120 = new e01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var121 = new e01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        e01 e01Var122 = new e01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var122.a("tg://settings/folders");
        e01 e01Var123 = new e01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            e01Var4 = e01Var123;
            e01Var5 = e01Var114;
            e01Var6 = e01Var116;
            e01Var7 = e01Var118;
            e01Var8 = new e01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(360928);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(360928);
                            sb0Var2.U(32);
                            return;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(360928);
                            sb0Var3.U(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(360928);
                            sb0Var4.U(128);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(360928);
                            sb0Var5.U(256);
                            return;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(360928);
                            sb0Var6.U(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            return;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            return;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i9 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.f42656s;
                                if (i9 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                        sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                        return;
                                    }
                                    i9++;
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
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            return;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            return;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            e01Var4 = e01Var123;
            e01Var5 = e01Var114;
            e01Var6 = e01Var116;
            e01Var7 = e01Var118;
            e01Var8 = null;
        }
        if (F(currentAccount, 0)) {
            e01Var9 = new e01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(360928);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(360928);
                            sb0Var2.U(32);
                            return;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(360928);
                            sb0Var3.U(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(360928);
                            sb0Var4.U(128);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(360928);
                            sb0Var5.U(256);
                            return;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(360928);
                            sb0Var6.U(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            return;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            return;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i9 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.f42656s;
                                if (i9 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                        sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                        return;
                                    }
                                    i9++;
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
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            return;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            return;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            e01Var9 = null;
        }
        if (F(currentAccount, 11)) {
            e01Var10 = new e01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
                            int i9 = 0;
                            while (true) {
                                if (i9 < 4) {
                                    if (UserConfig.getInstance(i9).isClientActivated()) {
                                        i9++;
                                    }
                                } else {
                                    i9 = -1;
                                }
                            }
                            if (i9 >= 0) {
                                o2Var.presentFragment(new fg0(i9));
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
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
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
                            o2Var.presentFragment(new y6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 27:
                            o2Var.presentFragment(new y6());
                            return;
                        case 28:
                            o2Var.presentFragment(new y6());
                            return;
                        default:
                            o2Var.presentFragment(new y6());
                            return;
                    }
                }
            });
        } else {
            e01Var10 = null;
        }
        if (F(currentAccount, 1)) {
            e01Var11 = new e01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
                            int i9 = 0;
                            while (true) {
                                if (i9 < 4) {
                                    if (UserConfig.getInstance(i9).isClientActivated()) {
                                        i9++;
                                    }
                                } else {
                                    i9 = -1;
                                }
                            }
                            if (i9 >= 0) {
                                o2Var.presentFragment(new fg0(i9));
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
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
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
                            o2Var.presentFragment(new y6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 27:
                            o2Var.presentFragment(new y6());
                            return;
                        case 28:
                            o2Var.presentFragment(new y6());
                            return;
                        default:
                            o2Var.presentFragment(new y6());
                            return;
                    }
                }
            });
        } else {
            e01Var11 = null;
        }
        if (F(currentAccount, 2)) {
            e01Var12 = new e01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
                            int i9 = 0;
                            while (true) {
                                if (i9 < 4) {
                                    if (UserConfig.getInstance(i9).isClientActivated()) {
                                        i9++;
                                    }
                                } else {
                                    i9 = -1;
                                }
                            }
                            if (i9 >= 0) {
                                o2Var.presentFragment(new fg0(i9));
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
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
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
                            o2Var.presentFragment(new y6());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 27:
                            o2Var.presentFragment(new y6());
                            return;
                        case 28:
                            o2Var.presentFragment(new y6());
                            return;
                        default:
                            o2Var.presentFragment(new y6());
                            return;
                    }
                }
            });
        } else {
            e01Var12 = null;
        }
        if (F(currentAccount, 8)) {
            e01Var13 = new e01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
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
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            return;
                    }
                }
            });
        } else {
            e01Var13 = null;
        }
        if (F(currentAccount, 3)) {
            e01Var14 = new e01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
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
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            return;
                    }
                }
            });
        } else {
            e01Var14 = null;
        }
        if (F(currentAccount, 4)) {
            e01Var15 = new e01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ai0(12, o2Var));
        } else {
            e01Var15 = null;
        }
        if (F(currentAccount, 5)) {
            e01Var16 = new e01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new p(1));
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
                            o2Var.presentFragment(new h21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            return;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            return;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(28700);
                            return;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(28700);
                            sb0Var5.U(16388);
                            return;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(28700);
                            sb0Var6.U(8200);
                            return;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(28700);
                            sb0Var7.U(4112);
                            return;
                    }
                }
            });
        } else {
            e01Var16 = null;
        }
        if (F(currentAccount, 9)) {
            e01Var17 = new e01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new p(1));
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
                            o2Var.presentFragment(new h21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            return;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            return;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(28700);
                            return;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(28700);
                            sb0Var5.U(16388);
                            return;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(28700);
                            sb0Var6.U(8200);
                            return;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(28700);
                            sb0Var7.U(4112);
                            return;
                    }
                }
            });
        } else {
            e01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            e01Var18 = new e01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new p(1));
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
                            o2Var.presentFragment(new h21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            return;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            return;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(28700);
                            return;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(28700);
                            sb0Var5.U(16388);
                            return;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(28700);
                            sb0Var6.U(8200);
                            return;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(28700);
                            sb0Var7.U(4112);
                            return;
                    }
                }
            });
        } else {
            e01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            e01Var19 = new e01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new p(1));
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
                            o2Var.presentFragment(new h21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            return;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            return;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(28700);
                            return;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(28700);
                            sb0Var5.U(16388);
                            return;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(28700);
                            sb0Var6.U(8200);
                            return;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(28700);
                            sb0Var7.U(4112);
                            return;
                    }
                }
            });
        } else {
            e01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            e01Var20 = new e01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new p(1));
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
                            o2Var.presentFragment(new h21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            return;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            return;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(28700);
                            return;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(28700);
                            sb0Var5.U(16388);
                            return;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(28700);
                            sb0Var6.U(8200);
                            return;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(28700);
                            sb0Var7.U(4112);
                            return;
                    }
                }
            });
        } else {
            e01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            e01Var21 = new e01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            return;
                        case 7:
                            o2Var.presentFragment(new p(1));
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
                            o2Var.presentFragment(new h21());
                            return;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            return;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            return;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            return;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            return;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            return;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(28700);
                            return;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(28700);
                            sb0Var5.U(16388);
                            return;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(28700);
                            sb0Var6.U(8200);
                            return;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(28700);
                            sb0Var7.U(4112);
                            return;
                    }
                }
            });
        } else {
            e01Var21 = null;
        }
        e01 e01Var124 = new e01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var124.a("tg://settings/power-saving");
        e01 e01Var125 = new e01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var125.a("tg://settings/power-saving/stickers");
        e01 e01Var126 = new e01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var127 = new e01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var128 = new e01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01Var128.a("tg://settings/power-saving/emoji");
        e01 e01Var129 = new e01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var130 = new e01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var131 = new e01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        return;
                    case 7:
                        o2Var.presentFragment(new p(1));
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
                        o2Var.presentFragment(new h21());
                        return;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        return;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        return;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        return;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        return;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        return;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(28700);
                        return;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(28700);
                        sb0Var5.U(16388);
                        return;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(28700);
                        sb0Var6.U(8200);
                        return;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(28700);
                        sb0Var7.U(4112);
                        return;
                }
            }
        });
        e01 e01Var132 = new e01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var132.a("tg://settings/power-saving/effects");
        e01 e01Var133 = new e01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var133.a("tg://settings/power-saving/background");
        e01 e01Var134 = new e01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01 e01Var135 = new e01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            e01Var22 = new e01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(360928);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(360928);
                            sb0Var2.U(32);
                            return;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(360928);
                            sb0Var3.U(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(360928);
                            sb0Var4.U(128);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(360928);
                            sb0Var5.U(256);
                            return;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(360928);
                            sb0Var6.U(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            return;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            return;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i9 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.f42656s;
                                if (i9 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                        sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                        return;
                                    }
                                    i9++;
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
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            return;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            return;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            e01Var22 = null;
        }
        e01 e01Var136 = new e01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01 e01Var137 = new e01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var137.a("tg://settings/power-saving/call-animations");
        e01 e01Var138 = new e01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var138.a("tg://settings/power-saving/videos");
        e01 e01Var139 = new e01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var139.a("tg://settings/power-saving/gifs");
        e01 e01Var140 = new e01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var140.a("tg://settings/power-saving/transitions");
        e01 e01Var141 = new e01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var141.a("tg://settings/language");
        e01 e01Var142 = new e01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            e01 e01Var143 = new e01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(360928);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(360928);
                            sb0Var2.U(32);
                            return;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(360928);
                            sb0Var3.U(64);
                            return;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(360928);
                            sb0Var4.U(128);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(360928);
                            sb0Var5.U(256);
                            return;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(360928);
                            sb0Var6.U(32768);
                            return;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            return;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            return;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i9 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.f42656s;
                                if (i9 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                        sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                        return;
                                    }
                                    i9++;
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
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            return;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            return;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            return;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            return;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            return;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            e01Var143.a("tg://settings/language/do-not-translate");
            e01Var43 = e01Var143;
        }
        e01 e01Var144 = new e01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var144.a("tg://settings/ask-question");
        e01 e01Var145 = new e01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var145.a("tg://settings/faq");
        e01 e01Var146 = new e01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(360928);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(360928);
                        sb0Var2.U(32);
                        return;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(360928);
                        sb0Var3.U(64);
                        return;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(360928);
                        sb0Var4.U(128);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(360928);
                        sb0Var5.U(256);
                        return;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(360928);
                        sb0Var6.U(32768);
                        return;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        return;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        return;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i9 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.f42656s;
                            if (i9 < arrayList.size()) {
                                if (((mb0) arrayList.get(i9)).f40377f == 1) {
                                    sb0Var10.f42650b.e1(new bg.x2(sb0Var10, i9, 11), 700, true);
                                    return;
                                }
                                i9++;
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
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        return;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        return;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        return;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        return;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        return;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        e01Var146.a("tg://settings/privacy-policy");
        return new e01[]{e01Var23, e01Var24, e01Var25, e01Var26, e01Var27, e01Var28, e01Var29, e01Var30, e01Var31, e01Var32, e01Var33, e01Var34, e01Var35, e01Var36, e01Var37, e01Var38, e01Var39, e01Var, e01Var41, e01Var42, e01Var2, e01Var44, e01Var45, e01Var46, e01Var47, e01Var48, e01Var49, e01Var50, e01Var51, e01Var52, e01Var53, e01Var3, e01Var54, e01Var55, e01Var56, e01Var57, e01Var58, e01Var59, e01Var60, e01Var61, e01Var62, e01Var63, e01Var64, e01Var65, e01Var66, e01Var67, e01Var68, e01Var69, e01Var70, e01Var71, e01Var72, e01Var73, e01Var74, e01Var75, e01Var76, e01Var77, e01Var78, e01Var79, e01Var80, e01Var81, e01Var82, e01Var83, e01Var84, e01Var85, e01Var86, e01Var87, e01Var88, e01Var89, e01Var90, e01Var91, e01Var92, e01Var93, e01Var94, e01Var95, e01Var96, e01Var97, e01Var98, e01Var99, e01Var100, e01Var101, e01Var102, e01Var103, e01Var104, e01Var105, e01Var106, e01Var107, e01Var108, e01Var109, e01Var110, e01Var111, e01Var112, e01Var113, e01Var5, e01Var115, e01Var6, e01Var117, e01Var7, e01Var119, e01Var120, e01Var121, e01Var122, e01Var4, e01Var8, e01Var9, e01Var10, e01Var11, e01Var12, e01Var13, e01Var14, e01Var15, e01Var16, e01Var17, e01Var18, e01Var19, e01Var20, e01Var21, e01Var124, e01Var125, e01Var126, e01Var127, e01Var128, e01Var129, e01Var130, e01Var131, e01Var132, e01Var133, e01Var134, e01Var135, e01Var22, e01Var136, e01Var137, e01Var138, e01Var139, e01Var140, e01Var141, e01Var142, e01Var43, e01Var144, e01Var145, e01Var146};
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
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
        if (!this.f38070w) {
            l();
        }
        if (arrayList.size() > 20) {
            aa.d.u(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj2 = arrayList.get(i9);
            if (obj2 instanceof e01) {
                ((e01) obj2).f37781g = i9;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i9;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i9 = this.f38066f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i9).faqWebPage;
        this.A = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i9).faqSearchArray);
        }
        if (this.A == null && !this.B) {
            this.B = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getWebPage, new m(this, 20));
        }
    }

    public final void I(String str) {
        this.f38072y = str;
        if (this.f38071x != null) {
            Utilities.searchQueue.cancelRunnable(this.f38071x);
            this.f38071x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f38070w = false;
            this.f38068r.clear();
            this.f38069s.clear();
            this.f38067n.clear();
            org.telegram.ui.ActionBar.o2 o2Var = this.f38065e;
            if (o2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) o2Var).L.f28883b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.f38065e).L.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ys0 ys0Var = new ys0(23, this, str);
        this.f38071x = ys0Var;
        dispatchQueue.postRunnable(ys0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        e01 e01Var;
        HashMap hashMap = new HashMap();
        int i9 = 0;
        while (true) {
            e01[] e01VarArr = this.f38064c;
            if (i9 >= e01VarArr.length) {
                break;
            }
            e01 e01Var2 = e01VarArr[i9];
            if (e01Var2 != null) {
                hashMap.put(Integer.valueOf(e01Var2.f37780f), this.f38064c[i9]);
            }
            i9++;
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
                            for (int i10 = 0; i10 < readInt323; i10++) {
                                strArr[i10] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(readString, strArr, serializedData.readString(false));
                        faqSearchResult.num = readInt32;
                        arrayList.add(faqSearchResult);
                    } else if (readInt322 == 1 && (e01Var = (e01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        e01Var.f37781g = readInt32;
                        arrayList.add(e01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(this));
    }

    @Override
    public final int h() {
        int size;
        int i9 = 0;
        if (this.f38070w) {
            int size2 = this.f38068r.size();
            if (!this.f38069s.isEmpty()) {
                i9 = this.f38069s.size() + 1;
            }
            return size2 + i9;
        }
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            size = 0;
        } else {
            size = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.d;
        if (!arrayList2.isEmpty()) {
            i9 = arrayList2.size() + 1;
        }
        return size + i9;
    }

    @Override
    public final int j(int i9) {
        if (this.f38070w) {
            if (i9 < this.f38068r.size() || i9 != this.f38068r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.v;
            if (i9 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i9 != arrayList.size() + 1) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        e01 e01Var;
        int i10;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
            return;
        }
        org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
        boolean z11 = false;
        if (this.f38070w) {
            if (i9 < this.f38068r.size()) {
                e01 e01Var2 = (e01) this.f38068r.get(i9);
                if (i9 > 0) {
                    e01Var = (e01) this.f38068r.get(i9 - 1);
                } else {
                    e01Var = null;
                }
                if (e01Var != null && e01Var.f37779e == e01Var2.f37779e) {
                    i10 = 0;
                } else {
                    i10 = e01Var2.f37779e;
                }
                CharSequence charSequence = (CharSequence) this.f38067n.get(i9);
                String[] strArr = e01Var2.d;
                if (i9 >= this.f38068r.size() - 1) {
                    z10 = false;
                }
                w6Var.b(charSequence, strArr, i10, z10);
                return;
            }
            int g10 = j3.r0.g(1, i9, this.f38068r);
            CharSequence charSequence2 = (CharSequence) this.f38067n.get(this.f38068r.size() + g10);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f38069s.get(g10)).path;
            if (g10 < this.f38068r.size() - 1) {
                z11 = true;
            }
            w6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i9--;
        }
        if (i9 < arrayList.size()) {
            Object obj = arrayList.get(i9);
            if (obj instanceof e01) {
                e01 e01Var3 = (e01) obj;
                String str = e01Var3.f37776a;
                String[] strArr3 = e01Var3.d;
                if (i9 >= arrayList.size() - 1) {
                    z10 = false;
                }
                w6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i9 < arrayList.size() - 1) {
                    z11 = true;
                }
                w6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int g11 = j3.r0.g(1, i9, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(g11);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (g11 < arrayList.size() - 1) {
            z11 = true;
        }
        w6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View w6Var;
        Context context = this.h;
        if (i9 != 0) {
            if (i9 != 1) {
                w6Var = new org.telegram.ui.Cells.m4(context, 16);
            } else {
                w6Var = new org.telegram.ui.Cells.v3(context, null);
            }
        } else {
            w6Var = new org.telegram.ui.Cells.w6(context);
        }
        w6Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(w6Var);
    }
}
