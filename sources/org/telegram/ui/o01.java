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
public class o01 extends org.telegram.ui.Components.hm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public n01[] f39621c;
    public final org.telegram.ui.ActionBar.n2 e;
    public final int f39622f;
    public final Context h;
    public boolean f39626w;
    public lv0 f39627x;
    public String f39628y;
    public final ArrayList d = new ArrayList();
    public ArrayList f39623n = new ArrayList();
    public ArrayList f39624r = new ArrayList();
    public ArrayList f39625s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public o01(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = n2Var;
        this.f39622f = n2Var.getCurrentAccount();
        this.h = context;
        this.f39621c = H(n2Var);
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

    public static n01[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        n01 n01Var;
        n01 n01Var2;
        n01 n01Var3;
        n01 n01Var4;
        n01 n01Var5;
        n01 n01Var6;
        n01 n01Var7;
        n01 n01Var8;
        n01 n01Var9;
        n01 n01Var10;
        n01 n01Var11;
        n01 n01Var12;
        n01 n01Var13;
        n01 n01Var14;
        n01 n01Var15;
        n01 n01Var16;
        n01 n01Var17;
        n01 n01Var18;
        n01 n01Var19;
        n01 n01Var20;
        n01 n01Var21;
        n01 n01Var22;
        n01 n01Var23;
        final int currentAccount = n2Var.getCurrentAccount();
        n01 n01Var24 = new n01(LocaleController.getString(R.string.EditName), 500, 0, new lv0(18, n2Var, n2Var.getResourceProvider()));
        n01 n01Var25 = new n01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var25.a("tg://settings/edit/change-number");
        n01 n01Var26 = new n01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var26.a("tg://settings/edit/add-account");
        n01 n01Var27 = new n01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var27.a("tg://settings/notifications");
        n01 n01Var28 = new n01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var28.a("tg://settings/notifications/private-chats");
        n01 n01Var29 = new n01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01Var29.a("tg://settings/notifications/groups");
        n01 n01Var30 = new n01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(7, n2Var));
        n01Var30.a("tg://settings/notifications/channels");
        n01 n01Var31 = new n01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(19, n2Var));
        n01 n01Var32 = new n01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var33 = new n01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var34 = new n01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(23, n2Var));
        n01Var34.a("tg://settings/notifications/new-contacts");
        n01 n01Var35 = new n01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var35.a("tg://settings/notifications/pinned-messages");
        n01 n01Var36 = new n01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var36.a("tg://settings/notifications/reset");
        n01 n01Var37 = new n01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01 n01Var38 = new n01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01 n01Var39 = new n01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01 n01Var40 = new n01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var40.a("tg://settings/privacy");
        n01 n01Var41 = new n01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var41.a("tg://settings/privacy/2sv");
        n01 n01Var42 = new n01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new v4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var2);
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
                            ybVar.f32599b.setText(spannableStringBuilder);
                            ybVar.f32599b.setSingleLine(false);
                            ybVar.f32599b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        n01Var42.a("tg://settings/privacy/auto-delete");
        n01 n01Var43 = new n01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var43.a("tg://settings/privacy/passcode");
        n01 n01Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            n01Var = n01Var41;
            n01Var2 = new n01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.W(360928);
                            sb0Var.V(64);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(360928);
                            sb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(360928);
                            sb0Var3.V(256);
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.W(360928);
                            sb0Var4.V(32768);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.V(1024);
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.V(2048);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var8.f41044s;
                                if (i10 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                        sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(mx0Var);
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
            n01Var2.a("tg://settings/privacy/login-email");
        } else {
            n01Var = n01Var41;
            n01Var2 = null;
        }
        n01 n01Var45 = new n01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var45.a("tg://settings/privacy/blocked");
        n01 n01Var46 = new n01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var46.a("tg://settings/devices");
        n01 n01Var47 = new n01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var47.a("tg://settings/privacy/phone-number/");
        n01 n01Var48 = new n01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var48.a("tg://settings/privacy/last-seen");
        n01 n01Var49 = new n01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var49.a("tg://settings/privacy/profile-photos");
        n01 n01Var50 = new n01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var50.a("tg://settings/privacy/forwards");
        n01 n01Var51 = new n01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var51.a("tg://settings/privacy/calls/p2p");
        n01 n01Var52 = new n01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var52.a("tg://settings/privacy/calls");
        n01 n01Var53 = new n01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var53.a("tg://settings/privacy/invites");
        n01 n01Var54 = new n01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new v4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var2);
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
                            ybVar.f32599b.setText(spannableStringBuilder);
                            ybVar.f32599b.setSingleLine(false);
                            ybVar.f32599b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            return;
                        }
                        n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        n01Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            n01Var3 = n01Var54;
            n01Var4 = new n01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
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
                                n2Var.presentFragment(new eg0(i10));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
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
                            n2Var.presentFragment(new c7());
                            return;
                        case 24:
                            n2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new c7());
                            return;
                        case 27:
                            n2Var.presentFragment(new c7());
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
            n01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            n01Var3 = n01Var54;
            n01Var4 = null;
        }
        n01 n01Var55 = new n01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var55.a("tg://settings/privacy/self-destruct");
        n01 n01Var56 = new n01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        n01 n01Var57 = new n01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var57.a("tg://settings/privacy/active-websites");
        n01 n01Var58 = new n01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var58.a("tg://settings/privacy/data-settings/delete-synced");
        n01 n01Var59 = new n01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        n01 n01Var60 = new n01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        n01 n01Var61 = new n01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var61.a("tg://settings/privacy/data-settings/map-provider");
        n01 n01Var62 = new n01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var62.a("tg://settings/privacy/data-settings/link-previews");
        n01 n01Var63 = new n01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var63.a("tg://settings/devices");
        n01 n01Var64 = new n01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var64.a("tg://settings/devices/terminate-sessions");
        n01 n01Var65 = new n01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var65.a("tg://settings/devices/link-desktop");
        n01 n01Var66 = new n01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var66.a("tg://settings/privacy/data-settings");
        n01 n01Var67 = new n01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01 n01Var68 = new n01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var68.a("tg://settings/data/storage");
        n01 n01Var69 = new n01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01 n01Var70 = new n01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01 n01Var71 = new n01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01 n01Var72 = new n01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
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
                            n2Var.presentFragment(new eg0(i10));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        return;
                    case 24:
                        n2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        n2Var.presentFragment(new c7());
                        return;
                    case 27:
                        n2Var.presentFragment(new c7());
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
        n01Var72.a("tg://settings/data/usage");
        n01 n01Var73 = new n01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var74 = new n01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var75 = new n01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var76 = new n01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var77 = new n01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01Var77.a("tg://settings/data/auto-download/reset");
        n01 n01Var78 = new n01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var79 = new n01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var80 = new n01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var81 = new n01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01Var81.a("tg://settings/data/use-less-data");
        n01 n01Var82 = new n01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var83 = new n01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01Var83.a("tg://settings/data/proxy");
        n01 n01Var84 = new n01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        n01 n01Var85 = new n01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01 n01Var86 = new n01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01Var86.a("tg://settings/data/save-to-photos/chats");
        n01 n01Var87 = new n01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        n01Var87.a("tg://settings/data/save-to-photos/groups");
        n01 n01Var88 = new n01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ci0(2, n2Var));
        n01Var88.a("tg://settings/data/save-to-photos/channels");
        n01 n01Var89 = new n01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ci0(3, n2Var));
        n01Var89.a("tg://settings/appearance/themes");
        n01 n01Var90 = new n01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(4, n2Var));
        n01Var90.a("tg://settings/appearance/text-size");
        n01 n01Var91 = new n01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(5, n2Var));
        n01Var91.a("tg://settings/appearance/wallpapers");
        n01 n01Var92 = new n01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ci0(6, n2Var));
        n01 n01Var93 = new n01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ci0(8, n2Var));
        n01 n01Var94 = new n01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(9, n2Var));
        n01 n01Var95 = new n01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(10, n2Var));
        n01 n01Var96 = new n01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ci0(11, n2Var));
        n01Var96.a("tg://settings/appearance/themes/create");
        n01 n01Var97 = new n01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(13, n2Var));
        n01Var97.a("tg://settings/appearance/message-corners");
        n01 n01Var98 = new n01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(14, n2Var));
        n01 n01Var99 = new n01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(15, n2Var));
        n01 n01Var100 = new n01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(16, n2Var));
        n01Var100.a("tg://settings/appearance/app-icon");
        n01 n01Var101 = new n01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(17, n2Var));
        n01 n01Var102 = new n01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(18, n2Var));
        n01Var102.a("tg://settings/appearance/tap-for-next-media");
        n01 n01Var103 = new n01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(20, n2Var));
        n01Var103.a("tg://settings/data/raise-to-listen");
        n01 n01Var104 = new n01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(21, n2Var));
        n01Var104.a("tg://settings/data/raise-to-speak");
        n01 n01Var105 = new n01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(22, n2Var));
        n01Var105.a("tg://settings/data/pause-music");
        n01 n01Var106 = new n01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(24, n2Var));
        n01 n01Var107 = new n01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(25, n2Var));
        n01 n01Var108 = new n01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(26, n2Var));
        n01 n01Var109 = new n01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(27, n2Var));
        n01 n01Var110 = new n01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new ci0(28, n2Var));
        n01Var110.a("tg://settings/appearance/stickers-and-emoji");
        n01 n01Var111 = new n01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new ci0(29, n2Var));
        n01 n01Var112 = new n01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var113 = new n01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var114 = new n01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        n01 n01Var115 = new n01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var116 = new n01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        n01 n01Var117 = new n01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var118 = new n01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        n01 n01Var119 = new n01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        n01 n01Var120 = new n01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var121 = new n01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        n01 n01Var122 = new n01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var122.a("tg://settings/folders");
        n01 n01Var123 = new n01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            n01Var5 = n01Var123;
            n01Var6 = n01Var114;
            n01Var7 = n01Var116;
            n01Var8 = n01Var118;
            n01Var9 = new n01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.W(360928);
                            sb0Var.V(64);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(360928);
                            sb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(360928);
                            sb0Var3.V(256);
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.W(360928);
                            sb0Var4.V(32768);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.V(1024);
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.V(2048);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var8.f41044s;
                                if (i10 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                        sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(mx0Var);
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
            n01Var5 = n01Var123;
            n01Var6 = n01Var114;
            n01Var7 = n01Var116;
            n01Var8 = n01Var118;
            n01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            n01Var10 = new n01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.W(360928);
                            sb0Var.V(64);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(360928);
                            sb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(360928);
                            sb0Var3.V(256);
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.W(360928);
                            sb0Var4.V(32768);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.V(1024);
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.V(2048);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var8.f41044s;
                                if (i10 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                        sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(mx0Var);
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
            n01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            n01Var11 = new n01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.W(360928);
                            sb0Var.V(64);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(360928);
                            sb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(360928);
                            sb0Var3.V(256);
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.W(360928);
                            sb0Var4.V(32768);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.V(1024);
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.V(2048);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var8.f41044s;
                                if (i10 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                        sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(mx0Var);
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
            n01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            n01Var12 = new n01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
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
                                n2Var.presentFragment(new eg0(i10));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
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
                            n2Var.presentFragment(new c7());
                            return;
                        case 24:
                            n2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new c7());
                            return;
                        case 27:
                            n2Var.presentFragment(new c7());
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
            n01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            n01Var13 = new n01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
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
                                n2Var.presentFragment(new eg0(i10));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
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
                            n2Var.presentFragment(new c7());
                            return;
                        case 24:
                            n2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new c7());
                            return;
                        case 27:
                            n2Var.presentFragment(new c7());
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
            n01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            n01Var14 = new n01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
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
                                n2Var.presentFragment(new eg0(i10));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
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
                            n2Var.presentFragment(new c7());
                            return;
                        case 24:
                            n2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            n2Var.presentFragment(new c7());
                            return;
                        case 27:
                            n2Var.presentFragment(new c7());
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
            n01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            n01Var15 = new n01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                            y0Var.D();
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            n01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            n01Var16 = new n01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                            y0Var.D();
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            n01Var16 = null;
        }
        if (F(currentAccount, 5)) {
            n01Var17 = new n01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ci0(12, n2Var));
        } else {
            n01Var17 = null;
        }
        if (F(currentAccount, 9)) {
            n01Var18 = new n01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
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
                            n2Var.presentFragment(new b21());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new sb0());
                            return;
                        case 19:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.V(3);
                            return;
                        case 20:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(3);
                            sb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(3);
                            sb0Var3.V(2);
                            return;
                        case 23:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.W(28700);
                            sb0Var5.V(16388);
                            return;
                        case 26:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.W(28700);
                            sb0Var6.V(8200);
                            return;
                        case 27:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.W(28700);
                            sb0Var7.V(4112);
                            return;
                        case 28:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            sb0Var8.V(360928);
                            return;
                        default:
                            sb0 sb0Var9 = new sb0();
                            n2Var.presentFragment(sb0Var9);
                            sb0Var9.W(360928);
                            sb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            n01Var18 = null;
        }
        if (F(currentAccount, 6)) {
            n01Var19 = new n01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
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
                            n2Var.presentFragment(new b21());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new sb0());
                            return;
                        case 19:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.V(3);
                            return;
                        case 20:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(3);
                            sb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(3);
                            sb0Var3.V(2);
                            return;
                        case 23:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.W(28700);
                            sb0Var5.V(16388);
                            return;
                        case 26:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.W(28700);
                            sb0Var6.V(8200);
                            return;
                        case 27:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.W(28700);
                            sb0Var7.V(4112);
                            return;
                        case 28:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            sb0Var8.V(360928);
                            return;
                        default:
                            sb0 sb0Var9 = new sb0();
                            n2Var.presentFragment(sb0Var9);
                            sb0Var9.W(360928);
                            sb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            n01Var19 = null;
        }
        if (F(currentAccount, 7)) {
            n01Var20 = new n01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
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
                            n2Var.presentFragment(new b21());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new sb0());
                            return;
                        case 19:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.V(3);
                            return;
                        case 20:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(3);
                            sb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(3);
                            sb0Var3.V(2);
                            return;
                        case 23:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.W(28700);
                            sb0Var5.V(16388);
                            return;
                        case 26:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.W(28700);
                            sb0Var6.V(8200);
                            return;
                        case 27:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.W(28700);
                            sb0Var7.V(4112);
                            return;
                        case 28:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            sb0Var8.V(360928);
                            return;
                        default:
                            sb0 sb0Var9 = new sb0();
                            n2Var.presentFragment(sb0Var9);
                            sb0Var9.W(360928);
                            sb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            n01Var20 = null;
        }
        if (F(currentAccount, 10)) {
            n01Var21 = new n01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
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
                            n2Var.presentFragment(new b21());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new sb0());
                            return;
                        case 19:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.V(3);
                            return;
                        case 20:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(3);
                            sb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(3);
                            sb0Var3.V(2);
                            return;
                        case 23:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.W(28700);
                            sb0Var5.V(16388);
                            return;
                        case 26:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.W(28700);
                            sb0Var6.V(8200);
                            return;
                        case 27:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.W(28700);
                            sb0Var7.V(4112);
                            return;
                        case 28:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            sb0Var8.V(360928);
                            return;
                        default:
                            sb0 sb0Var9 = new sb0();
                            n2Var.presentFragment(sb0Var9);
                            sb0Var9.W(360928);
                            sb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            n01Var21 = null;
        }
        if (F(currentAccount, 12)) {
            n01Var22 = new n01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            n2Var.presentFragment(new p(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            n2Var.presentFragment(new p(1));
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
                            n2Var.presentFragment(new b21());
                            return;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            n2Var.presentFragment(new sb0());
                            return;
                        case 19:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.V(3);
                            return;
                        case 20:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(3);
                            sb0Var2.V(1);
                            return;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(3);
                            sb0Var3.V(2);
                            return;
                        case 23:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.V(28700);
                            return;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.W(28700);
                            sb0Var5.V(16388);
                            return;
                        case 26:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.W(28700);
                            sb0Var6.V(8200);
                            return;
                        case 27:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.W(28700);
                            sb0Var7.V(4112);
                            return;
                        case 28:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            sb0Var8.V(360928);
                            return;
                        default:
                            sb0 sb0Var9 = new sb0();
                            n2Var.presentFragment(sb0Var9);
                            sb0Var9.W(360928);
                            sb0Var9.V(32);
                            return;
                    }
                }
            });
        } else {
            n01Var22 = null;
        }
        n01 n01Var124 = new n01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var124.a("tg://settings/power-saving");
        n01 n01Var125 = new n01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var125.a("tg://settings/power-saving/stickers");
        n01 n01Var126 = new n01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var127 = new n01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var128 = new n01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var128.a("tg://settings/power-saving/emoji");
        n01 n01Var129 = new n01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var130 = new n01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var131 = new n01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01 n01Var132 = new n01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var132.a("tg://settings/power-saving/effects");
        n01 n01Var133 = new n01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                        n2Var.presentFragment(new p(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        n2Var.presentFragment(new p(1));
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
                        n2Var.presentFragment(new b21());
                        return;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        n2Var.presentFragment(new sb0());
                        return;
                    case 19:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.V(3);
                        return;
                    case 20:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(3);
                        sb0Var2.V(1);
                        return;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(3);
                        sb0Var3.V(2);
                        return;
                    case 23:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.V(28700);
                        return;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.W(28700);
                        sb0Var5.V(16388);
                        return;
                    case 26:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.W(28700);
                        sb0Var6.V(8200);
                        return;
                    case 27:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.W(28700);
                        sb0Var7.V(4112);
                        return;
                    case 28:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        sb0Var8.V(360928);
                        return;
                    default:
                        sb0 sb0Var9 = new sb0();
                        n2Var.presentFragment(sb0Var9);
                        sb0Var9.W(360928);
                        sb0Var9.V(32);
                        return;
                }
            }
        });
        n01Var133.a("tg://settings/power-saving/background");
        n01 n01Var134 = new n01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01 n01Var135 = new n01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
            n01Var23 = new n01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.W(360928);
                            sb0Var.V(64);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(360928);
                            sb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(360928);
                            sb0Var3.V(256);
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.W(360928);
                            sb0Var4.V(32768);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.V(1024);
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.V(2048);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var8.f41044s;
                                if (i10 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                        sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(mx0Var);
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
            n01Var23 = null;
        }
        n01 n01Var136 = new n01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01 n01Var137 = new n01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var137.a("tg://settings/power-saving/call-animations");
        n01 n01Var138 = new n01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var138.a("tg://settings/power-saving/videos");
        n01 n01Var139 = new n01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var139.a("tg://settings/power-saving/gifs");
        n01 n01Var140 = new n01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var140.a("tg://settings/power-saving/transitions");
        n01 n01Var141 = new n01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var141.a("tg://settings/language");
        n01 n01Var142 = new n01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            n01 n01Var143 = new n01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            n2Var.presentFragment(sb0Var);
                            sb0Var.W(360928);
                            sb0Var.V(64);
                            return;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            n2Var.presentFragment(sb0Var2);
                            sb0Var2.W(360928);
                            sb0Var2.V(128);
                            return;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            sb0 sb0Var3 = new sb0();
                            n2Var.presentFragment(sb0Var3);
                            sb0Var3.W(360928);
                            sb0Var3.V(256);
                            return;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            n2Var.presentFragment(sb0Var4);
                            sb0Var4.W(360928);
                            sb0Var4.V(32768);
                            return;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            n2Var.presentFragment(sb0Var5);
                            sb0Var5.V(512);
                            return;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            sb0 sb0Var6 = new sb0();
                            n2Var.presentFragment(sb0Var6);
                            sb0Var6.V(1024);
                            return;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            n2Var.presentFragment(sb0Var7);
                            sb0Var7.V(2048);
                            return;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            n2Var.presentFragment(sb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var8.f41044s;
                                if (i10 < arrayList.size()) {
                                    if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                        sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            return;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            return;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(mx0Var);
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
            n01Var143.a("tg://settings/language/do-not-translate");
            n01Var44 = n01Var143;
        }
        n01 n01Var144 = new n01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var144.a("tg://settings/ask-question");
        n01 n01Var145 = new n01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var145.a("tg://settings/faq");
        n01 n01Var146 = new n01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        n2Var.presentFragment(sb0Var);
                        sb0Var.W(360928);
                        sb0Var.V(64);
                        return;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        n2Var.presentFragment(sb0Var2);
                        sb0Var2.W(360928);
                        sb0Var2.V(128);
                        return;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        sb0 sb0Var3 = new sb0();
                        n2Var.presentFragment(sb0Var3);
                        sb0Var3.W(360928);
                        sb0Var3.V(256);
                        return;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        n2Var.presentFragment(sb0Var4);
                        sb0Var4.W(360928);
                        sb0Var4.V(32768);
                        return;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        n2Var.presentFragment(sb0Var5);
                        sb0Var5.V(512);
                        return;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        sb0 sb0Var6 = new sb0();
                        n2Var.presentFragment(sb0Var6);
                        sb0Var6.V(1024);
                        return;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        n2Var.presentFragment(sb0Var7);
                        sb0Var7.V(2048);
                        return;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        n2Var.presentFragment(sb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var8.f41044s;
                            if (i10 < arrayList.size()) {
                                if (((mb0) arrayList.get(i10)).f39066f == 1) {
                                    sb0Var8.f41039b.e1(new i2.r(sb0Var8, i10, 13), 700, true);
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        return;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        return;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(mx0Var);
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
        n01Var146.a("tg://settings/privacy-policy");
        return new n01[]{n01Var24, n01Var25, n01Var26, n01Var27, n01Var28, n01Var29, n01Var30, n01Var31, n01Var32, n01Var33, n01Var34, n01Var35, n01Var36, n01Var37, n01Var38, n01Var39, n01Var40, n01Var, n01Var42, n01Var43, n01Var2, n01Var45, n01Var46, n01Var47, n01Var48, n01Var49, n01Var50, n01Var51, n01Var52, n01Var53, n01Var3, n01Var4, n01Var55, n01Var56, n01Var57, n01Var58, n01Var59, n01Var60, n01Var61, n01Var62, n01Var63, n01Var64, n01Var65, n01Var66, n01Var67, n01Var68, n01Var69, n01Var70, n01Var71, n01Var72, n01Var73, n01Var74, n01Var75, n01Var76, n01Var77, n01Var78, n01Var79, n01Var80, n01Var81, n01Var82, n01Var83, n01Var84, n01Var85, n01Var86, n01Var87, n01Var88, n01Var89, n01Var90, n01Var91, n01Var92, n01Var93, n01Var94, n01Var95, n01Var96, n01Var97, n01Var98, n01Var99, n01Var100, n01Var101, n01Var102, n01Var103, n01Var104, n01Var105, n01Var106, n01Var107, n01Var108, n01Var109, n01Var110, n01Var111, n01Var112, n01Var113, n01Var6, n01Var115, n01Var7, n01Var117, n01Var8, n01Var119, n01Var120, n01Var121, n01Var122, n01Var5, n01Var9, n01Var10, n01Var11, n01Var12, n01Var13, n01Var14, n01Var15, n01Var16, n01Var17, n01Var18, n01Var19, n01Var20, n01Var21, n01Var22, n01Var124, n01Var125, n01Var126, n01Var127, n01Var128, n01Var129, n01Var130, n01Var131, n01Var132, n01Var133, n01Var134, n01Var135, n01Var23, n01Var136, n01Var137, n01Var138, n01Var139, n01Var140, n01Var141, n01Var142, n01Var44, n01Var144, n01Var145, n01Var146};
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45913f == 0) {
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
        if (!this.f39626w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof n01) {
                ((n01) obj2).f39278g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f39622f;
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
        this.f39628y = str;
        if (this.f39627x != null) {
            Utilities.searchQueue.cancelRunnable(this.f39627x);
            this.f39627x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f39626w = false;
            this.f39624r.clear();
            this.f39625s.clear();
            this.f39623n.clear();
            org.telegram.ui.ActionBar.n2 n2Var = this.e;
            if (n2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) n2Var).P.f30073b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        lv0 lv0Var = new lv0(19, this, str);
        this.f39627x = lv0Var;
        dispatchQueue.postRunnable(lv0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        n01 n01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            n01[] n01VarArr = this.f39621c;
            if (i10 >= n01VarArr.length) {
                break;
            }
            n01 n01Var2 = n01VarArr[i10];
            if (n01Var2 != null) {
                hashMap.put(Integer.valueOf(n01Var2.f39277f), this.f39621c[i10]);
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
                    } else if (readInt322 == 1 && (n01Var = (n01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        n01Var.f39278g = readInt32;
                        arrayList.add(n01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new kg0(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f39626w) {
            int size2 = this.f39624r.size();
            if (!this.f39625s.isEmpty()) {
                i10 = this.f39625s.size() + 1;
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
        if (this.f39626w) {
            if (i10 < this.f39624r.size() || i10 != this.f39624r.size()) {
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
        n01 n01Var;
        int i11;
        int i12 = b1Var.f45913f;
        View view = b1Var.f45910a;
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
        org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
        boolean z11 = false;
        if (this.f39626w) {
            if (i10 < this.f39624r.size()) {
                n01 n01Var2 = (n01) this.f39624r.get(i10);
                if (i10 > 0) {
                    n01Var = (n01) this.f39624r.get(i10 - 1);
                } else {
                    n01Var = null;
                }
                if (n01Var != null && n01Var.e == n01Var2.e) {
                    i11 = 0;
                } else {
                    i11 = n01Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f39623n.get(i10);
                String[] strArr = n01Var2.d;
                if (i10 >= this.f39624r.size() - 1) {
                    z10 = false;
                }
                w6Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.f39624r);
            CharSequence charSequence2 = (CharSequence) this.f39623n.get(this.f39624r.size() + g10);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f39625s.get(g10)).path;
            if (g10 < this.f39624r.size() - 1) {
                z11 = true;
            }
            w6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof n01) {
                n01 n01Var3 = (n01) obj;
                String str = n01Var3.f39274a;
                String[] strArr3 = n01Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                w6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i10 < arrayList.size() - 1) {
                    z11 = true;
                }
                w6Var.a(str2, strArr4, true, z11);
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
        w6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                w6Var = new org.telegram.ui.Cells.l4(context, 16);
            } else {
                w6Var = new org.telegram.ui.Cells.u3(context, null);
            }
        } else {
            w6Var = new org.telegram.ui.Cells.w6(context);
        }
        w6Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(w6Var);
    }
}
